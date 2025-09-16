package org.example.rick_and_morty

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform