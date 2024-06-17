package br.com.alura.musicasBD.models

class Album(
    val id: Int = 0,
    val title: String = "Título do álbum",
    val band: Band = Band(),
) {
    override fun toString(): String {
        return "$title ($id) - $band"
    }
}