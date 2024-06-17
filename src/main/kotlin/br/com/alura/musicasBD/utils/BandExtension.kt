package br.com.alura.musicasBD.utils

import br.com.alura.musicasBD.database.entities.BandEntity
import br.com.alura.musicasBD.models.Band

fun Band.transformToEntity(): BandEntity {
    return BandEntity(
        id = this.id,
        name = this.name,
        description = this.description,
    )
}

fun BandEntity.transformToModel(): Band {
    return Band(
        id = this.id,
        name = this.name,
        description = this.description,
    )
}