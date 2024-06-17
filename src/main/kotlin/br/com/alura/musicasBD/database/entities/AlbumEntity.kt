package br.com.alura.musicasBD.database.entities

import javax.persistence.*

@Entity
@Table(name = "albums")
class AlbumEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val title: String = "",
    @ManyToOne
    val band: BandEntity = BandEntity(),
)