import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter

@Composable
fun PlayerCircle(playerNumber: Int, playerId: Int, imageUrl: String, navController: NavController) {
    val circleColor = Color(0xFF303038)
    Box(
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .background(circleColor)
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = rememberImagePainter(data = imageUrl),
            contentDescription = "Player Image",
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "$playerNumber",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
        Button(
            onClick = { navController.navigate(PlayerRepository.Screen.PlayerDetail.createRoute(playerId)) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            modifier = Modifier.fillMaxSize()
        ) {}
    }
}