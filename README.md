# Movie Discovery App

## Overview
This is a **Movie Discovery App** that allows users to:
- Browse **popular movies** from the TMDB API
- View **movie details** with similar movie suggestions
- **Search** for movies
- **Mark movies as favorites** (stored locally using Room)
- **Support both light and dark themes**
- **Handle offline support** and proper error handling

## Tech Stack
- **Language**: Kotlin (1.9.0+)
- **UI**: Jetpack Compose, Material3
- **State Management**: MVVM (ViewModel, UiState, UiEvent)
- **Dependency Injection**: Hilt
- **Networking**: Retrofit + OkHttp
- **Local Storage**: Room Database
- **Async Operations**: Coroutines & Flow
- **Navigation**: Jetpack Compose Navigation
- **Testing**: JUnit, Mockito, Compose UI Testing

---

## Architecture
The app follows **Clean Architecture** with the following layers:
```
app/
├── di/                # Dependency Injection (Hilt)
├── domain/            # Business Logic Layer
│   ├── model/         # Data Models
│   ├── repository/    # Repository Interfaces
│   └── usecase/       # Use Cases
├── data/              # Data Layer (Local & Remote)
│   ├── local/         # Room Database
│   ├── remote/        # Retrofit API Service
│   └── repository/    # Repository Implementation
├── presentation/      # UI Layer (Compose Screens)
│   ├── navigation/    # Navigation Graph
│   ├── theme/         # Light/Dark Theme
│   ├── features/      # UI Screens (Movie List, Details, Favorites)
│   ├── components/    # Reusable UI Components
└── build.gradle.kts   # Project Dependencies
```

---

## Setup Instructions
### **1. Clone the Repository**
```sh
git clone https://github.com/YOUR_GITHUB/MovieDiscoveryApp.git
cd MovieDiscoveryApp
```
### **2. Add TMDB API Key**
1. Get a **TMDB API Key** from [TMDB API](https://developers.themoviedb.org/3)
2. Add it to `local.properties` file:
```properties
TMDB_API_KEY=your_api_key_here
```
3. Modify `gradle.properties`:
```properties
MOVIE_API_KEY=${TMDB_API_KEY}
```

### **3. Run the App**
```sh
./gradlew assembleDebug
```

---

## Features
### **Movie List Screen**
✅ Display **popular movies** in a grid
✅ Implement **infinite scrolling**
✅ Show **movie poster, title, and rating**
✅ **Pull-to-refresh**
✅ **Search functionality**
✅ **Error handling & loading states**

### **Movie Detail Screen**
✅ Show **detailed information**
✅ Display **similar movies** as a horizontal list
✅ Implement **favorite functionality** (persisted locally)
✅ **Handle configuration changes**

### **Favorites Screen**
✅ Show list of **favorited movies**
✅ Allow **removal of favorites**
✅ Implement **empty state handling**

### **Additional Features**
✅ **Dark Mode support**
✅ **Offline support** with Room caching
✅ **Proper error handling & logging**
✅ **Material3 UI with light & dark themes**

---

## Testing Strategy
### **Unit Tests**
- ✅ ViewModel Tests (JUnit, Coroutine Test)
- ✅ Repository Tests (Mockito, Fake DataSource)
- ✅ UseCase Tests

### **UI Tests**
- ✅ Compose UI Tests (`ComposeTestRule`)
- ✅ Navigation Tests
- ✅ Dark Mode Tests

To run tests:
```sh
./gradlew test
./gradlew connectedAndroidTest
```

---

## Assumptions & Trade-offs
- **Used Room for local storage** instead of SharedPreferences to ensure better data persistence.
- **Infinite scrolling implemented using Paging 3** is not included in the base implementation but can be added.
- **Search only works when online**, but caching can be added later.

---

## Future Improvements
✅ Implement **CI/CD pipeline**
✅ Add **animations & transitions**
✅ Improve **accessibility support**
✅ Implement **deep linking**
✅ Add **widget support**
✅ Optimize **performance monitoring**
✅ Integrate **Google Analytics or Firebase for tracking**

---

## Submission Guidelines
1. **Create a Private GitHub Repository**
2. **Ensure Commit History is Clean**
3. **Create a Pull Request with Implementation Details**
4. **Include APK in Releases Section**

---

## **Author**
👨‍💻 **Senior Android Developer** - [Erick Rojas Perez]
📧 Email: erick_rojas_perez@hotmail.com
📌 LinkedIn: [https://www.linkedin.com/in/erick-rojas-perez-349262b5/]

