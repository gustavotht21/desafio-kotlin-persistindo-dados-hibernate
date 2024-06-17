package br.com.alura.musicasBD.database.dao

import br.com.alura.musicasBD.database.entities.BandEntity
import br.com.alura.musicasBD.models.Band
import br.com.alura.musicasBD.utils.transformToEntity
import br.com.alura.musicasBD.utils.transformToModel
import javax.persistence.EntityManager

class BandDAO(manager: EntityManager) : BaseDAO<Band, BandEntity>(manager, BandEntity::class.java) {
    override fun transformToEntity(model: Band): BandEntity {
        return model.transformToEntity()
    }

    override fun transformToModel(entity: BandEntity): Band {
        return entity.transformToModel()
    }
}