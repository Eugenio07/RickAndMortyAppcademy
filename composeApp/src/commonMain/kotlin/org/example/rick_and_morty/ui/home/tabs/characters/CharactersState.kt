package org.example.rick_and_morty.ui.home.tabs.characters

import org.example.rick_and_morty.domain.model.CharacterModel

data class CharactersState(
    val characterOfTheDay:CharacterModel? = null
)