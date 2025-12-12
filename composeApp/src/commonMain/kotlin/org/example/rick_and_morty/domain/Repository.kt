package org.example.rick_and_morty.domain

import org.example.rick_and_morty.domain.model.CharacterModel

interface Repository {
    suspend fun getSingleCharacter(id:String): CharacterModel
}