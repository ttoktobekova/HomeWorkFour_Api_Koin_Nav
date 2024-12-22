package com.example.homeworkfour_api_koin_nav.ui.ui.topBar

import CharactersScreen
import LocationsScreen
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.homeworkfour_api_koin_nav.ui.data.di.composable.CharacterDetailsScreen
import com.example.homeworkfour_api_koin_nav.ui.data.di.composable.LocationDetailsScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { AppTopBar(navController) },
        bottomBar = { AppBottomBar(navController) }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "characters",
            Modifier.padding(padding)
        ) {
            composable("characters") { CharactersScreen(navController) }
            composable("locations") { LocationsScreen(navController) }
            composable("character_details/{id}") { backStackEntry ->
                CharacterDetailsScreen(backStackEntry.arguments?.getString("id"))
            }
            composable("location_details/{id}") { backStackEntry ->
                LocationDetailsScreen(backStackEntry.arguments?.getString("id"))
            }
        }
    }
}