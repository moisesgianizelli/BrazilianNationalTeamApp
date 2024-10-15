import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter

@Composable
fun PlayerDetailScreen(playerId: Int, navController: NavController) {
    // Find the player by ID
    val player = PlayerRepository.players.find { it.id == playerId }

    if (player != null) {
        var isFavorite by remember { mutableStateOf(player.isFavorite) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Load player image
            Image(
                painter = rememberImagePainter(player.imageUrl),
                contentDescription = player.name,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Player details
            Text(text = player.name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = "Position: ${player.position}", fontSize = 16.sp)
            Text(text = "Age: ${player.age}", fontSize = 16.sp)
            Text(text = "Team: ${player.team}", fontSize = 16.sp)
            Text(text = "Description: ${player.description}", fontSize = 16.sp)

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    if (isFavorite) {
                        PlayerRepository.removeFromFavorites(player)
                    } else {
                        PlayerRepository.addToFavorites(player)
                    }
                    isFavorite = !isFavorite
                },
                enabled = !isFavorite
            ) {
                Text(if (isFavorite) "Added to Favorites" else "Add to Favorites")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
        }
    } else {
        Text("Player not found.")
    }
}
