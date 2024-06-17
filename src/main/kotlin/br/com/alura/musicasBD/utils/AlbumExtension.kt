package br.com.alura.musicasBD.utils

import br.com.alura.musicasBD.database.entities.AlbumEntity
import br.com.alura.musicasBD.models.Album

fun Album.transformToEntity(): AlbumEntity {
    return AlbumEntity(
        id = this.id,
        title = this.title,
        band = this.band.transformToEntity(),
    )
}

fun AlbumEntity.transformToModel(): Album {
    return Album(
        id = this.id,
        title = this.title,
        band = this.band.transformToModel(),
    )
}