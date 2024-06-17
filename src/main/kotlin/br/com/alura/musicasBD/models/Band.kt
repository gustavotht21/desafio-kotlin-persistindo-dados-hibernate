package br.com.alura.musicasBD.models

class Band(
    val id: Int = 0,
    val name: String = "Nome da banda",
    val description: String = "Descrição da banda",
) {
    override fun toString(): String {
        return "$name ($id)"
    }
}