package com.example.homeworkfour_api_koin_nav.ui.data.di.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homeworkfour_api_koin_nav.ui.data.models.Character
import com.example.homeworkfour_api_koin_nav.ui.data.repository.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class CharacterDetailsViewModel @Inject constructor(private val repository: CharactersRepository) :
    ViewModel() {
    var character by mutableStateOf<Character?>(null)
        private set

    fun fetchCharacterDetails(id: String) {
        viewModelScope.launch {
            character = repository.getCharactersDetails(id)
        }
    }

}