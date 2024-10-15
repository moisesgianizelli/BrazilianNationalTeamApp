package com.example.myapplication

import AchievementsScreen
import AllPlayersScreen
import BottomNavigationBar
import FavoritesScreen
import FormationScreen
import FormationScreen442
import PlayerDetailScreen
import WelcomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MainFunction()
            }
        }
    }
}
@Composable
fun MainFunction() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = PlayerRepository.Screen.Welcome.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(PlayerRepository.Screen.Welcome.route) {
                WelcomeScreen(navController)
            }
            composable(PlayerRepository.Screen.Formation.route) {
                FormationScreen(navController)
            }
            composable(PlayerRepository.Screen.Formation442.route) {
                FormationScreen442(navController)
            }
            composable(PlayerRepository.Screen.Favorites.route) {
                FavoritesScreen(navController)
            }
            composable(PlayerRepository.Screen.PlayerDetail.route) { backStackEntry ->
                val playerId = backStackEntry.arguments?.getString("playerId")?.toInt() ?: return@composable
                PlayerDetailScreen(playerId, navController)
            }
            composable(PlayerRepository.Screen.Achievements.route) {
                AchievementsScreen(navController)
            }
            composable("players") {
                AllPlayersScreen(navController)
            }
        }
    }
}


