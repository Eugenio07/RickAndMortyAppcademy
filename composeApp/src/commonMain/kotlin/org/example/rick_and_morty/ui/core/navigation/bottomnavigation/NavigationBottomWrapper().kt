package org.example.rick_and_morty.ui.core.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.serialization.json.Json
import org.example.rick_and_morty.ui.core.navigation.CharacterDetail
import org.example.rick_and_morty.ui.home.tabs.characters.CharactersScreen
import org.example.rick_and_morty.ui.home.tabs.episodes.EpisodesScreen
import org.example.rick_and_morty.ui.core.navigation.Routes

@Composable
fun NavigationBottomWrapper(
    navController: NavHostController,
    mainNavController: NavHostController
) {
    NavHost(navController = navController, startDestination = Routes.Episodes.route) {
        composable(route = Routes.Episodes.route) {
            EpisodesScreen()
        }
        composable(route = Routes.Characters.route) {
            CharactersScreen(
                navigateToDetail = { characterModel ->
                    val encode: String = Json.encodeToString(characterModel)
                    mainNavController.navigate(CharacterDetail(encode))
                }
            )
        }
    }
}
