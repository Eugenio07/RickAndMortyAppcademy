# Rick & Morty — Kotlin Multiplatform

![Kotlin](https://img.shields.io/badge/Kotlin-2.2.0-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-1.9.3-4285F4?style=flat&logo=jetpackcompose&logoColor=white)
![Platforms](https://img.shields.io/badge/Platforms-Android%20%7C%20iOS%20%7C%20Desktop-5CCF92?style=flat)

Cross-platform **Kotlin Multiplatform (KMP)** and **Compose Multiplatform** application targeting **Android**, **iOS**, and **Desktop (JVM)** from a single shared codebase (`commonMain`). Built with **Clean Architecture**, **MVVM**, **Koin**, **Ktor**, **Room KMP**, and **Paging 3**, consuming the [Rick and Morty API](https://rickandmortyapi.com/).

---

## ✨ Features

- **Episodes Feed & Trailer Player**
  - Horizontally paginated episode carousel (`EpisodesScreen`) with season-specific artwork (`S01`–`S07`) and episode codes.
  - Animated in-app trailer player backed by platform-native video/web implementations (`VideoView` on Android, `WKWebView` on iOS, and `KCEF` WebView on Desktop).
- **Characters Directory & Daily Spotlight**
  - **Character of the Day** spotlight card cached locally per calendar day using **Room KMP** and `kotlinx-datetime`.
  - Paginated character directory (`CharactersScreen`) using adaptive grid layouts on Desktop and 2-column grids on mobile, with image loading via **Coil 3**.
- **Character Detail View**
  - Displays status (`ALIVE` / `DEAD` indicator), species, origin, gender, and asynchronously loaded episode appearances (`CharacterDetailScreen`).
- **Adaptive Multiplatform UX**
  - Dynamic light and dark Material 3 themes via `isSystemInDarkTheme()`.
  - Platform-tuned ergonomics: Android `SplashScreen` API integration, Desktop scrollbars, hover tooltips, and explicit back navigation on Desktop detail views.

---

## 🧱 Architecture & Project Structure

The shared module follows a layered **Clean Architecture + MVVM** separation with platform-specific `expect` / `actual` abstractions for database creation, Ktor engines, UI scrolling/grid layouts, and video playback:

```text
composeApp/
├── schemas/                     # Exported Room database schemas
└── src/
    ├── commonMain/
    │   ├── composeResources/    # Shared drawable assets
    │   └── kotlin/org/example/rick_and_morty/
    │       ├── App.kt
    │       ├── Platform.kt & Target.kt
    │       ├── data/            # Ktor ApiService, PagingSources, Room DB/DAOs/Entities, RepositoryImpl
    │       ├── di/              # Koin modules (DataModule, DomainModule, UIModule, DIConfigurator)
    │       ├── domain/          # Domain models, Repository contract, GetRandomCharacter use case
    │       └── ui/              # Compose screens, ViewModels, States, type-safe Navigation & Components
    ├── androidMain/             # RickMortyApp, MainActivity, OkHttp, Room Android builder, VideoView
    ├── iosMain/                 # MainViewController, Darwin engine, Room NSDocumentDirectory, WKWebView
    └── desktopMain/             # Desktop main window (KCEF), CIO engine, Scrollbars, WebView
iosApp/
└── iosApp.xcodeproj             # Xcode project wrapping ComposeApp framework
```

---

## 🛠️ Tech Stack

| Category | Libraries & Versions |
| :--- | :--- |
| **Language & Build** | Kotlin `2.2.0` · AGP `8.13.2` · KSP `2.2.0-2.0.2` · Gradle `8.14.3` |
| **UI & Navigation** | Compose Multiplatform `1.9.3` · Navigation Compose `2.9.1` · Lifecycle ViewModel Compose `2.9.6` · Core SplashScreen `1.2.0` · Compose WebView Multiplatform `2.0.3` |
| **Networking & Media** | Ktor `3.3.3` (`OkHttp`, `Darwin`, `CIO`, `ContentNegotiation`) · Coil `3.3.0` (`coil-compose`, `coil-network-ktor3`) |
| **Local Storage & Paging** | Room `2.7.2` · SQLite Bundled `2.5.2` · Cash App Paging `3.3.0-alpha02-0.5.1` |
| **DI & Utilities** | Koin `4.1.1` (`koin-core`, `koin-android`, `koin-compose`, `koin-compose-viewmodel`) · `kotlinx-datetime` `0.7.1` · `kotlinx-serialization` |

---

## 🚀 Getting Started

### Prerequisites
- **JDK 11+**
- **Android Studio** (for Android & Desktop)
- **Xcode** on macOS (for iOS)

### Run on Android (`minSdk 24` · `compileSdk 36` · `targetSdk 34`)
```bash
./gradlew :composeApp:assembleDebug
```
Or open the project in Android Studio and run the **`composeApp`** configuration.

### Run on Desktop (JVM)
```bash
./gradlew :composeApp:run
```
Or execute `main()` in `composeApp/src/desktopMain/kotlin/org/example/rick_and_morty/main.kt`.

### Run on iOS
Open `iosApp/iosApp.xcodeproj` in Xcode and run on an iOS Simulator (set `TEAM_ID` in `iosApp/Configuration/Config.xcconfig` if deploying to a physical device).

---

## 📸 Screenshots

> _Add captures from Android, iOS, and Desktop runs to showcase the multiplatform UI:_

| Android | iOS | Desktop |
| :---: | :---: | :---: |
| _Coming soon_ | _Coming soon_ | _Coming soon_ |

---

## 👤 Author

**Eugenio Martínez** — Senior Mobile Developer · Android & Kotlin Multiplatform (KMP)  
[![GitHub](https://img.shields.io/badge/GitHub-Eugenio07-181717?style=flat&logo=github)](https://github.com/Eugenio07)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-eugeniormartinez-0A66C2?style=flat&logo=linkedin)](https://www.linkedin.com/in/eugeniormartinez)
