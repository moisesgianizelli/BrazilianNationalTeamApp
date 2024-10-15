import androidx.compose.runtime.mutableStateListOf


// Data Class Player
data class Player(
    val id: Int,
    val name: String,
    val position: String,
    val age: Int,
    val description: String,
    val team: String,
    val imageUrl: String,
    var isFavorite: Boolean = false
)

// PlayerRepository
object PlayerRepository {
    val players = listOf(
        Player(1, "Alisson Becker", "Goalkeeper", 31, "Brazilian goalkeeper currently playing for Liverpool.", "Liverpool", "https://static1.purepeople.com.br/articles/8/31/22/28/@/3529812-pai-de-alisson-sofre-afogamento-e-morre-580x0-2.jpg"),
        Player(2, "Thiago Silva", "Defender", 39, "Experienced Brazilian defender playing for Chelsea.", "Chelsea", "https://ds-images.bolavip.com/news/image?src=https%3A%2F%2Fimages.somosfanaticos.fans%2Fwebp%2Fbr%2Ffull%2FSFBR_20240502_SFBR_225144_Thiago-Silva-e-procurado-de-ultima-hora-para-reforcar-rival-do-Fluminense-scaled-e1714649427224.webp&width=740&height=416"),
        Player(3, "Marquinhos", "Defender", 29, "Central defender playing for Paris Saint-Germain.", "PSG", "https://s2-ge.glbimg.com/ySp3r4f633IJepYtkr5Pnt99lUk=/0x0:1080x1268/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2022/O/8/7XBDzyRUSCmloxtom8gQ/316122340-540020840870169-1510689851565741251-n.jpg"),
        Player(4, "Danilo", "Defender", 32, "Right back currently playing for Juventus.", "Juventus", "https://veja.abril.com.br/wp-content/uploads/2022/12/GettyImages-1245389887.jpg?quality=70&strip=info&w=1280&h=720&crop=1"),
        Player(5, "Alex Sandro", "Defender", 32, "Left back playing for Juventus.", "Juventus", "https://static.gazetaesportiva.com/uploads/imagem/2019/07/04/01267446-1024x681.jpg"),
        Player(6, "Casemiro", "Midfielder", 32, "Defensive midfielder currently playing for Manchester United.", "Manchester United", "https://conteudo.imguol.com.br/c/esporte/ff/2022/08/16/casemiro-em-acao-com-a-camisa-da-selecao-brasileira-volante-do-real-madrid-virou-alvo-de-interesse-do-manchester-united-1660688947014_v2_900x506.jpg.webp"),
        Player(7, "Lucas Paquetá", "Midfielder", 27, "Creative midfielder playing for West Ham United.", "West Ham", "https://www.acidadeon.com/tudoep/wp-content/uploads/sites/10/2024/05/paqueta_2024-05-24_15-22-37-888x700.webp"),
        Player(8, "Neymar Jr.", "Forward", 32, "Star forward playing for Al-Hilal.", "Al-Hilal", "https://static.gazetaesportiva.com/uploads/imagem/2019/07/03/000_1HU4A0.jpg"),
        Player(9, "Richarlison", "Forward", 26, "Forward playing for Tottenham Hotspur.", "Tottenham", "https://i0.statig.com.br/bancodeimagens/imgalta/3i/wu/iv/3iwuivxbfgqe1bjribjx3njou.jpg"),
        Player(10, "Vinícius Júnior", "Forward", 23, "Talented winger playing for Real Madrid.", "Real Madrid", "https://www.sindmetalsjc.org.br/arquivo/thumb/noticias/a408a5cbbb04a45ba826_990x500_0_0_1_1.png"),
        Player(11, "Rodrygo", "Forward", 23, "Forward currently playing for Real Madrid.", "Real Madrid", "https://ds-images.bolavip.com/news/image?src=https%3A%2F%2Fimages.somosfanaticos.fans%2Fwebp%2Fbr%2Ffull%2FSFBR_20230725_SFBR_25646_Tudo-acertado-Rodrygo-do-Real-Madrid-confirma-propostas-de-dois-gigantes-do-futebol-europeu-scaled-e1690294142685.webp&width=740&height=416")
    )

    val favoritePlayers = mutableStateListOf<Player>() // List of favorite players

    fun addToFavorites(player: Player) {
        if (!favoritePlayers.contains(player)) {
            favoritePlayers.add(player)
        }
    }

    fun removeFromFavorites(player: Player) {
        favoritePlayers.remove(player)
    }

    fun isPlayerFavorite(player: Player): Boolean {
        return favoritePlayers.contains(player)
    }

    fun getPlayerById(id: Int): Player? {
        return players.find { it.id == id }
    }

    sealed class Screen(val route: String) {
        object Welcome : Screen("welcome")
        object Formation : Screen("formation")
        object Formation442 : Screen("formation_4_4_2")
        object PlayerDetail : Screen("player_detail/{playerId}") {
            fun createRoute(playerId: Int) = "player_detail/$playerId"
        }
        object Favorites : Screen("favorites")
        object Achievements : Screen("achievements")
    }
}