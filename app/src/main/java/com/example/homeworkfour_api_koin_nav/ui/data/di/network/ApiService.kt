package com.example.homeworkfour_api_koin_nav.ui.data.di.network

import LocationModel
import com.example.homeworkfour_api_koin_nav.ui.data.models.Character
import com.example.homeworkfour_api_koin_nav.ui.data.models.RickAndMortyResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("character")
    suspend fun getCharacters(): RickAndMortyResponse<Character>

    @GET("character/{id")
    suspend fun getCharactersDetails(@Path("id") id: String): Character

    @GET("location")
    suspend fun getLocations(): RickAndMortyResponse<LocationModel>

    @GET("location/{id")
    suspend fun getLocationDetails(@Path("id") id: String): LocationModel
}