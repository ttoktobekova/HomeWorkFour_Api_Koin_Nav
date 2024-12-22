package com.example.homeworkfour_api_koin_nav.ui.data.di.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.homeworkfour_api_koin_nav.ui.data.di.viewModels.LocationDetailsViewModel

@Composable
fun LocationDetailsScreen(id: String?, viewModel: LocationDetailsViewModel = hiltViewModel()) {
    val location = viewModel.location

    location?.let {
        Column {
            Text(it.name, style = MaterialTheme.typography.headlineMedium)
            Text("Type: ${it.type}")
            Text("Dimension: ${it.dimension}")
        }
    }
}
