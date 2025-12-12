package org.example.rick_and_morty

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.example.rick_and_morty.ui.core.navigation.NavigationWrapper
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavigationWrapper()
    }
}