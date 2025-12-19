package org.example.rick_and_morty

expect fun getCurrentTarget(): Target

enum class Target {
    iOS, Android, Desktop
}

fun isDesktop() = getCurrentTarget() == Target.Desktop
fun isAndroid() = getCurrentTarget() == Target.Android
fun isiOS() = getCurrentTarget() == Target.iOS