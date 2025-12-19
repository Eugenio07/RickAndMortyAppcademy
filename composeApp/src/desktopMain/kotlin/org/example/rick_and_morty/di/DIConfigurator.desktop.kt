package org.example.rick_and_morty.di

import org.example.rick_and_morty.data.database.getDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module {
    return module {
        single { getDatabase() }
    }
}