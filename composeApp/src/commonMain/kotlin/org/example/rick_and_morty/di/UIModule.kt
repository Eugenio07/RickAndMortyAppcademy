package org.example.rick_and_morty.di

import org.example.rick_and_morty.ui.detail.CharacterDetailViewModel
import org.example.rick_and_morty.ui.home.tabs.characters.CharactersViewModel
import org.example.rick_and_morty.ui.home.tabs.episodes.EpisodesViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {
    viewModelOf(::EpisodesViewModel)
    viewModelOf(::CharactersViewModel)
    viewModelOf(::CharacterDetailViewModel)
}
