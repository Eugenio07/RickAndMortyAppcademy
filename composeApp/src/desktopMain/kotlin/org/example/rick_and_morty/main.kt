package org.example.rick_and_morty

import androidx.compose.material3.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.rick_and_morty.di.initKoin

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Rick and Morty APP"
    ){
        initKoin()
        App()
    }
}