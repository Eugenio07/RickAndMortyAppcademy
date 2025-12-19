package org.example.rick_and_morty

class DesktopPlatform : Platform {
    override val name: String = "Soy escritorio :D"
}

actual fun getPlatform(): Platform = DesktopPlatform()