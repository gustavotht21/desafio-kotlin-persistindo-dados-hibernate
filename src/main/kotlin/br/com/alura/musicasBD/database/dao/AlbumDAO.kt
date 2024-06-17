package br.com.alura.musicasBD.database.dao

import br.com.alura.musicasBD.database.entities.AlbumEntity
import br.com.alura.musicasBD.models.Album
import br.com.alura.musicasBD.utils.transformToEntity
import br.com.alura.musicasBD.utils.transformToModel
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager) : BaseDAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {
    override fun transformToEntity(model: Album): AlbumEntity {
        return model.transformToEntity()
    }
    
    override fun transformToModel(entity: AlbumEntity): Album {
        return entity.transformToModel()
    }
}