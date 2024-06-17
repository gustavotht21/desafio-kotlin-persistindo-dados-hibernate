package br.com.alura.musicasBD.database.dao

import javax.persistence.EntityManager

abstract class BaseDAO<TModel, TEntity>(
    private val manager: EntityManager, private val entity: Class<TEntity>
) {
    abstract fun transformToModel(entity: TEntity): TModel
    abstract fun transformToEntity(model: TModel): TEntity

    fun getAll(): List<TModel> {
        val query = this.manager.createQuery("FROM ${this.entity.simpleName}", this.entity)
        return query.resultList.map { transformToModel(it) }
    }

    fun get(id: Int): TModel {
        val query = this.manager.createQuery("FROM ${this.entity.simpleName} WHERE id = :id", this.entity)
        query.setParameter("id", id)
        return transformToModel(query.singleResult)
    }

    fun insert(model: TModel) {
        val entity = transformToEntity(model)
        manager.transaction.begin()
        manager.persist(manager.merge(entity))
        manager.transaction.commit()
    }

    fun delete(id: Int) {
        val query = this.manager.createQuery("FROM ${this.entity.simpleName} WHERE id = :id", this.entity)
        query.setParameter("id", id)
        manager.transaction.begin()
        manager.remove(entity)
        manager.transaction.commit()
    }
}