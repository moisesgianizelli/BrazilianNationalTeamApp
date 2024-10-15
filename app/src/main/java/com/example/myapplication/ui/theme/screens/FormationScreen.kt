import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter


@Composable
fun FormationScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = rememberImagePainter("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Football_field.svg/1200px-Football_field.svg.png"), // Substitua pela URL da imagem de fundo
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { navController.navigate(PlayerRepository.Screen.Formation442.route) },
                modifier = Modifier.align(Alignment.Start)
            ) {
                Text("Change to 4-4-2")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 1, playerId = 1, imageUrl = "https://static1.purepeople.com.br/articles/8/31/22/28/@/3529812-pai-de-alisson-sofre-afogamento-e-morre-580x0-2.jpg", navController = navController)
                    Text(text = "Alisson Becker", style = MaterialTheme.typography.bodyMedium)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 2, playerId = 2, imageUrl = "https://ds-images.bolavip.com/news/image?src=https%3A%2F%2Fimages.somosfanaticos.fans%2Fwebp%2Fbr%2Ffull%2FSFBR_20240502_SFBR_225144_Thiago-Silva-e-procurado-de-ultima-hora-para-reforcar-rival-do-Fluminense-scaled-e1714649427224.webp&width=740&height=416", navController = navController)
                    Text(text = "Thiago Silva", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 3, playerId = 3, imageUrl = "https://s2-ge.glbimg.com/ySp3r4f633IJepYtkr5Pnt99lUk=/0x0:1080x1268/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2022/O/8/7XBDzyRUSCmloxtom8gQ/316122340-540020840870169-1510689851565741251-n.jpg", navController = navController)
                    Text(text = "Marquinhos", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 4, playerId = 4, imageUrl = "https://veja.abril.com.br/wp-content/uploads/2022/12/GettyImages-1245389887.jpg?quality=70&strip=info&w=1280&h=720&crop=1", navController = navController)
                    Text(text = "Danilo", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 5, playerId = 5, imageUrl = "https://static.gazetaesportiva.com/uploads/imagem/2019/07/04/01267446-1024x681.jpg", navController = navController)
                    Text(text = "Alex Sandro", style = MaterialTheme.typography.bodyMedium)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 6, playerId = 6, imageUrl = "https://conteudo.imguol.com.br/c/esporte/ff/2022/08/16/casemiro-em-acao-com-a-camisa-da-selecao-brasileira-volante-do-real-madrid-virou-alvo-de-interesse-do-manchester-united-1660688947014_v2_900x506.jpg.webp", navController = navController)
                    Text(text = "Casemiro", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 7, playerId = 7, imageUrl = "https://www.acidadeon.com/tudoep/wp-content/uploads/sites/10/2024/05/paqueta_2024-05-24_15-22-37-888x700.webp", navController = navController)
                    Text(text = "Lucas Paquetá", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 8, playerId = 8, imageUrl = "https://static.gazetaesportiva.com/uploads/imagem/2019/07/03/000_1HU4A0.jpg", navController = navController)
                    Text(text = "Neymar Jr.", style = MaterialTheme.typography.bodyMedium)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 9, playerId = 9, imageUrl = "https://i0.statig.com.br/bancodeimagens/imgalta/3i/wu/iv/3iwuivxbfgqe1bjribjx3njou.jpg", navController = navController)
                    Text(text = "Richarlison", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 10, playerId = 10, imageUrl = "https://www.sindmetalsjc.org.br/arquivo/thumb/noticias/a408a5cbbb04a45ba826_990x500_0_0_1_1.png", navController = navController)
                    Text(text = "Vinícius Júnior", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 11, playerId = 11, imageUrl = "https://ds-images.bolavip.com/news/image?src=https%3A%2F%2Fimages.somosfanaticos.fans%2Fwebp%2Fbr%2Ffull%2FSFBR_20230725_SFBR_25646_Tudo-acertado-Rodrygo-do-Real-Madrid-confirma-propostas-de-dois-gigantes-do-futebol-europeu-scaled-e1690294142685.webp&width=740&height=416", navController = navController)
                    Text(text = "Rodrygo", style = MaterialTheme.typography.bodyMedium)
                }
            }

            Button(onClick = { navController.navigate(PlayerRepository.Screen.Achievements.route) }) {
                Text("View Team Achievements")
            }
        }
    }
}

@Composable
fun FormationScreen442(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = rememberImagePainter("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Football_field.svg/1200px-Football_field.svg.png"),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { navController.navigate(PlayerRepository.Screen.Formation.route) }, // Permita voltar à formação anterior, se necessário
                modifier = Modifier.align(Alignment.Start)
            ) {
                Text("Change to 4-3-3")
            }

            // Goalkeeper (1)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 1, playerId = 1, imageUrl = "https://static1.purepeople.com.br/articles/8/31/22/28/@/3529812-pai-de-alisson-sofre-afogamento-e-morre-580x0-2.jpg", navController = navController)
                    Text(text = "Alisson Becker", style = MaterialTheme.typography.bodyMedium)
                }
            }

            // (2, 3, 4, 5)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 2, playerId = 2, imageUrl = "https://ds-images.bolavip.com/news/image?src=https%3A%2F%2Fimages.somosfanaticos.fans%2Fwebp%2Fbr%2Ffull%2FSFBR_20240502_SFBR_225144_Thiago-Silva-e-procurado-de-ultima-hora-para-reforcar-rival-do-Fluminense-scaled-e1714649427224.webp&width=740&height=416", navController = navController)
                    Text(text = "Thiago Silva", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 3, playerId = 3, imageUrl = "https://s2-ge.glbimg.com/ySp3r4f633IJepYtkr5Pnt99lUk=/0x0:1080x1268/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2022/O/8/7XBDzyRUSCmloxtom8gQ/316122340-540020840870169-1510689851565741251-n.jpg", navController = navController)
                    Text(text = "Marquinhos", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 4, playerId = 4, imageUrl = "https://veja.abril.com.br/wp-content/uploads/2022/12/GettyImages-1245389887.jpg?quality=70&strip=info&w=1280&h=720&crop=1", navController = navController)
                    Text(text = "Danilo", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 5, playerId = 5, imageUrl = "https://static.gazetaesportiva.com/uploads/imagem/2019/07/04/01267446-1024x681.jpg", navController = navController)
                    Text(text = "Alex Sandro", style = MaterialTheme.typography.bodyMedium)
                }
            }

            // (6, 7, 11)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 6, playerId = 6, imageUrl = "https://conteudo.imguol.com.br/c/esporte/ff/2022/08/16/casemiro-em-acao-com-a-camisa-da-selecao-brasileira-volante-do-real-madrid-virou-alvo-de-interesse-do-manchester-united-1660688947014_v2_900x506.jpg.webp", navController = navController)
                    Text(text = "Casemiro", style = MaterialTheme.typography.bodyMedium)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 8, playerId = 8, imageUrl = "https://static.gazetaesportiva.com/uploads/imagem/2019/07/03/000_1HU4A0.jpg", navController = navController)
                    Text(text = "Neymar Jr.", style = MaterialTheme.typography.bodyMedium)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 7, playerId = 7, imageUrl = "https://www.acidadeon.com/tudoep/wp-content/uploads/sites/10/2024/05/paqueta_2024-05-24_15-22-37-888x700.webp", navController = navController)
                    Text(text = "Lucas Paquetá", style = MaterialTheme.typography.bodyMedium)
                }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                PlayerCircle(playerNumber = 11, playerId = 11, imageUrl = "https://ds-images.bolavip.com/news/image?src=https%3A%2F%2Fimages.somosfanaticos.fans%2Fwebp%2Fbr%2Ffull%2FSFBR_20230725_SFBR_25646_Tudo-acertado-Rodrygo-do-Real-Madrid-confirma-propostas-de-dois-gigantes-do-futebol-europeu-scaled-e1690294142685.webp&width=740&height=416", navController = navController)
                Text(text = "Rodrygo", style = MaterialTheme.typography.bodyMedium)
            }

            // (9, 10)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 9, playerId = 9, imageUrl = "https://i0.statig.com.br/bancodeimagens/imgalta/3i/wu/iv/3iwuivxbfgqe1bjribjx3njou.jpg", navController = navController)
                    Text(text = "Richarlison", style = MaterialTheme.typography.bodyMedium)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    PlayerCircle(playerNumber = 10, playerId = 10, imageUrl = "https://www.sindmetalsjc.org.br/arquivo/thumb/noticias/a408a5cbbb04a45ba826_990x500_0_0_1_1.png", navController = navController)
                    Text(text = "Vinícius Júnior", style = MaterialTheme.typography.bodyMedium)
                }
            }

            Button(onClick = { navController.navigate(PlayerRepository.Screen.Achievements.route) }) {
                Text("View Team Achievements")
            }
        }
    }
}
