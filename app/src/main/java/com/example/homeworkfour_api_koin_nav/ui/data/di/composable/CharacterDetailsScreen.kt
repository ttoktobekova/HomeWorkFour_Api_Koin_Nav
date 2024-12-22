package com.example.homeworkfour_api_koin_nav.ui.data.di.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.homeworkfour_api_koin_nav.ui.data.di.viewModels.CharacterDetailsViewModel

@Composable
fun CharacterDetailsScreen(id: String?, viewModel: CharacterDetailsViewModel = hiltViewModel()) {
    val character = viewModel.character

    character?.let {
        Column {
            AsyncImage(model = it.image, contentDescription = null, Modifier.size(200.dp))
            Text(it.name, style = MaterialTheme.typography.headlineMedium)
            Text("Status: ${it.status}")
            Text("Species: ${it.species}")
            Text("Gender: ${it.gender}")
        }
    }
}