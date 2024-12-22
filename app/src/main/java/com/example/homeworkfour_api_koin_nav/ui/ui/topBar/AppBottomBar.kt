package com.example.homeworkfour_api_koin_nav.ui.ui.topBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AppBottomBar(navController: NavController) {
    BottomAppBar {
        IconButton(onClick = { navController.navigate("characters") }) {
            Icon(Icons.Default.Person, contentDescription = "Characters")
        }
        IconButton(onClick = { navController.navigate("locations") }) {
            Icon(Icons.Default.Place, contentDescription = "Locations")
        }
    }
}