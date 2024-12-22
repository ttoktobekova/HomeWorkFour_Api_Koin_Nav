package com.example.homeworkfour_api_koin_nav.ui.data.di.viewModels

import LocationModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homeworkfour_api_koin_nav.ui.data.repository.LocationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class LocationsViewModel  @Inject constructor(private val repository: LocationRepository):ViewModel(){
    var locations by mutableStateOf(emptyList<LocationModel>())
        private set
    init {fetchLocations() }
    private fun fetchLocations() {
        viewModelScope.launch {
            locations = repository.getLocations()
        }
    }
}