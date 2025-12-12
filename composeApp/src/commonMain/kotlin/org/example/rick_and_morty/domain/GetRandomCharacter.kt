package org.example.rick_and_morty.domain

import org.example.rick_and_morty.domain.model.CharacterModel

class GetRandomCharacter(private val repository: Repository) {

    suspend operator fun invoke(): CharacterModel {
        val random: Int = (1..826).random()
        return repository.getSingleCharacter(random.toString())
    }
}
