package org.example.rick_and_morty

import androidx.compose.ui.window.ComposeUIViewController
import org.example.rick_and_morty.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }