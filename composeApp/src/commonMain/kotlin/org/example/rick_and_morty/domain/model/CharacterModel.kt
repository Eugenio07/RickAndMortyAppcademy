package org.example.rick_and_morty.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class CharacterModel(
    val id: Int,
    val isAlive: Boolean,
    val image: String,
    val name:String,
    val species:String,
    val gender:String,
    val origin:String,
    val episodes:List<String>
)