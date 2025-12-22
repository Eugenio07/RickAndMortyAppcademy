package org.example.rick_and_morty.data.remote.response

import kotlinx.serialization.Serializable
import org.example.rick_and_morty.domain.model.EpisodeModel
import org.example.rick_and_morty.domain.model.SeasonEpisode
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_1
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_2
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_3
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_4
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_5
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_6
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_7
import org.example.rick_and_morty.domain.model.SeasonEpisode.UNKNOWN

@Serializable
data class EpisodeResponse(
    val id: Int,
    val name: String,
    val episode: String,
    val characters: List<String>
) {
    fun toDomain(): EpisodeModel {
        val season = getSeasonFromEpisodeCode(episode)
        return EpisodeModel(
            id = id,
            name = name,
            episode = episode,
            characters = characters.map { url -> url.substringAfter("/") },
            season = season,
            videoURL = getVideoUrlFromSeason(season)
        )
    }



    private fun getSeasonFromEpisodeCode(episode: String): SeasonEpisode {
        return when {
            episode.startsWith("S01") -> SEASON_1
            episode.startsWith("S02") -> SEASON_2
            episode.startsWith("S03") -> SEASON_3
            episode.startsWith("S04") -> SEASON_4
            episode.startsWith("S05") -> SEASON_5
            episode.startsWith("S06") -> SEASON_6
            episode.startsWith("S07") -> SEASON_7
            else -> UNKNOWN
        }
    }
}
expect fun getVideoUrlFromSeason(season: SeasonEpisode): String

