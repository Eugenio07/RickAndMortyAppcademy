package org.example.rick_and_morty.ui.detail

import org.example.rick_and_morty.domain.model.CharacterModel
import org.example.rick_and_morty.domain.model.EpisodeModel

data class CharacterDetailState(
    val characterModel: CharacterModel,
    val episodes: List<EpisodeModel>? = null
)