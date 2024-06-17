import br.com.alura.musicasBD.database.Database
import br.com.alura.musicasBD.database.dao.BandDAO
import br.com.alura.musicasBD.models.Band
import javax.persistence.EntityManager

fun main() {
    val manager: EntityManager = Database.getEntityManager()
    val bandDao = BandDAO(manager)

    val newBand = Band(
        id = 1, name = "Radiohead", description = "Banda do balacobaco"
    )

    bandDao.insert(newBand)
}