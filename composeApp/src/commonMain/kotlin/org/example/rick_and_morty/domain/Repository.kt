package org.example.rick_and_morty.domain

import app.cash.paging.PagingData
import kotlinx.coroutines.flow.Flow
import org.example.rick_and_morty.domain.model.CharacterModel
import org.example.rick_and_morty.domain.model.CharacterOfTheDayModel

interface Repository {
    suspend fun getSingleCharacter(id:String): CharacterModel

    fun getAllCharacters(): Flow<PagingData<CharacterModel>>
    suspend fun getCharacterDB(): CharacterOfTheDayModel?
    suspend fun saveCharacterDB(characterOfTheDayModel:CharacterOfTheDayModel)
}