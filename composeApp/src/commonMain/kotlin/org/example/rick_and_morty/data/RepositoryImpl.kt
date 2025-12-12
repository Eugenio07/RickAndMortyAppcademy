package org.example.rick_and_morty.data

import org.example.rick_and_morty.data.remote.ApiService
import org.example.rick_and_morty.domain.Repository
import org.example.rick_and_morty.domain.model.CharacterModel

class RepositoryImpl(private val api:ApiService):Repository {
    override suspend fun getSingleCharacter(id: String): CharacterModel {
        return api.getSingleCharacter(id).toDomain()
    }
}