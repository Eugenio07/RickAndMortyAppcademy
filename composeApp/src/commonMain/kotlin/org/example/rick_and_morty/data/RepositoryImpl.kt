package org.example.rick_and_morty.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import app.cash.paging.PagingData
import kotlinx.coroutines.flow.Flow
import org.example.rick_and_morty.data.remote.ApiService
import org.example.rick_and_morty.data.remote.paging.CharactersPagingSource
import org.example.rick_and_morty.domain.Repository
import org.example.rick_and_morty.domain.model.CharacterModel

class RepositoryImpl(
    private val api: ApiService,
    private val charactersPagingSource: CharactersPagingSource
) : Repository {
    companion object {
        const val MAX_ITEMS = 20
        const val PREFETCH_ITEMS = 5
    }

    override suspend fun getSingleCharacter(id: String): CharacterModel {
        return api.getSingleCharacter(id).toDomain()
    }

    override fun getAllCharacters(): Flow<PagingData<CharacterModel>> {
        return Pager(
            config = PagingConfig(pageSize = MAX_ITEMS, prefetchDistance = PREFETCH_ITEMS),
            pagingSourceFactory = { charactersPagingSource }).flow
    }
}