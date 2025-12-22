package org.example.rick_and_morty.data.remote.response

import org.example.rick_and_morty.domain.model.SeasonEpisode
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_1
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_2
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_3
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_4
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_5
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_6
import org.example.rick_and_morty.domain.model.SeasonEpisode.SEASON_7
import org.example.rick_and_morty.domain.model.SeasonEpisode.UNKNOWN

actual fun getVideoUrlFromSeason(season: SeasonEpisode): String {
    return when (season) {
        SEASON_1 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        SEASON_2 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        SEASON_3 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        SEASON_4 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        SEASON_5 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        SEASON_6 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        SEASON_7 -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
        UNKNOWN -> "https://firebasestorage.googleapis.com/v0/b/rickmortykmp.appspot.com/o/RICK%20Y%20MORTY%20(Trailer%20espan%CC%83ol)%20(1).mp4?alt=media&token=b7f5ef8f-aa58-4451-9d6c-b1ed83d7ba31"
    }
}