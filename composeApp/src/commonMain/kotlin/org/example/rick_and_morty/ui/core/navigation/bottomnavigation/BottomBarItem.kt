package org.example.rick_and_morty.ui.core.navigation.bottomnavigation


import androidx.compose.runtime.Composable
import org.example.rick_and_morty.ui.core.navigation.Routes

sealed class BottomBarItem {
    abstract val route: String
    abstract val title: String
    abstract val icon: @Composable () -> Unit

    data class Episodes(
        override val route: String = Routes.Episodes.route,
        override val title: String = "Episodes",
        override val icon: @Composable () -> Unit = {
            //Icon(imageVector = Icons.Default.Home, "")
        }
    ) : BottomBarItem()

    data class Characters(
        override val route: String = Routes.Characters.route,
        override val title: String = "Characters",
        override val icon: @Composable () -> Unit = {
           // Icon(imageVector = Icons.Default.Person, "")
            }
    ) : BottomBarItem()
}