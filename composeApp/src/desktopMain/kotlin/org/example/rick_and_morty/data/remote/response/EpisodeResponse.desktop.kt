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
        SEASON_1 -> "https://www.youtube.com/watch?v=8BEzj2kRjO8&ab_channel=RottenTomatoesTV"
        SEASON_2 -> "https://www.youtube.com/watch?v=SXwf_9xJu5c&ab_channel=Yusuto"
        SEASON_3 -> "https://www.youtube.com/watch?v=Bmg2vXOQ3kM&ab_channel=SeriesTrailerMP"
        SEASON_4 -> "https://www.youtube.com/watch?v=bLI2-v264No&ab_channel=RottenTomatoesTV"
        SEASON_5 -> "https://www.youtube.com/watch?v=yC1UxW8vcDo&ab_channel=RottenTomatoesTV"
        SEASON_6 -> "https://www.youtube.com/watch?v=jerFRSQW9g8&ab_channel=RottenTomatoesTV"
        SEASON_7 -> "https://www.youtube.com/watch?v=PkZtVBNkmso&ab_channel=RottenTomatoesTV"
        UNKNOWN -> "https://youtu.be/E8cXKMR9a1Q?si=G0i6q8XDb126U4I5"
    }
}
