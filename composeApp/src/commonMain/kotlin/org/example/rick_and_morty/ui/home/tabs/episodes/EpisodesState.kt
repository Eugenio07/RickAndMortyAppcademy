package org.example.rick_and_morty.ui.home.tabs.episodes

import app.cash.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import org.example.rick_and_morty.domain.model.EpisodeModel

data class EpisodesState(val characters: Flow<PagingData<EpisodeModel>> = emptyFlow())