package com.example.homeworkfour_api_koin_nav.ui.data.repository

import com.example.homeworkfour_api_koin_nav.ui.data.models.Character
import com.example.homeworkfour_api_koin_nav.ui.data.di.network.ApiService
import javax.inject.Inject

class CharactersRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getCharacters(): List<Character> = apiService.getCharacters().results
    suspend fun getCharactersDetails(id: String): Character = apiService.getCharactersDetails(id)
}

