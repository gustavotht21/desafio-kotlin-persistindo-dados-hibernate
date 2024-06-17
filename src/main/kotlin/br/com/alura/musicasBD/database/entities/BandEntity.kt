package br.com.alura.musicasBD.database.entities

import javax.persistence.*

@Entity
@Table(name = "bands")
open class BandEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int = 0,
    val name: String = "",
    val description: String = "",
)