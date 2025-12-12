package org.example.rick_and_morty.ui.core.navigation

sealed class Routes(val route:String){
    data object Home:Routes("home")

    //BottomNav
    data object Episodes:Routes("episodes")
    data object Characters:Routes("characters")
}