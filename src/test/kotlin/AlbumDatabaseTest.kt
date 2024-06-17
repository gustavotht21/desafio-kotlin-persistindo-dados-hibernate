import br.com.alura.musicasBD.database.Database
import br.com.alura.musicasBD.database.dao.AlbumDAO
import br.com.alura.musicasBD.database.dao.BandDAO
import br.com.alura.musicasBD.models.Album
import javax.persistence.EntityManager

fun main() {
    val manager: EntityManager = Database.getEntityManager()
    val albumDao = AlbumDAO(manager)
    val bandDao = BandDAO(manager)

    val newAlbum = Album(
        id = 1, title = "Ok Computer", band = bandDao.get(1)
    )

    albumDao.insert(newAlbum)
}