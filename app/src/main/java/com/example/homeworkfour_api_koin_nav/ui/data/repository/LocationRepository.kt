package com.example.homeworkfour_api_koin_nav.ui.data.repository

import LocationModel
import com.example.homeworkfour_api_koin_nav.ui.data.di.network.ApiService
import javax.inject.Inject

class LocationRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getLocations(): List<LocationModel> = apiService.getLocations().results
    suspend fun getLocationDetails(id: String): LocationModel = apiService.getLocationDetails(id)
}