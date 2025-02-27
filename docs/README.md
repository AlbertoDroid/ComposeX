# 📦 ComposeX - Jetpack Compose UI Components Library

![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-%2300C853.svg?style=flat&logo=android&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg)
![Build](https://github.com/AlbertoDroid/ComposeX/workflows/Build/badge.svg)

## 🚀 Introduction
**ComposeX** is an open-source **Jetpack Compose UI Components Library** designed to provide developers with **high-quality, customizable UI components** for Android apps.

### ✨ Features
- 🏗️ **Prebuilt UI Components** (Buttons, Cards, Dialogs, Snackbars, etc.)
- 🚀 **Animated & Customizable** for a modern app experience
- 🎨 **Material 3 & Theming Support**
- 📦 **Lightweight & Easy to Use**
- 🔓 **Open-source & Community Driven**

## 📥 Installation

### Using **JitPack** (Coming Soon)
Add JitPack repository to your project’s **root** `build.gradle.kts`:

```kotlin
repositories {
    maven("https://jitpack.io")
}
```

Then add the dependency in your module's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.yourusername:ComposeX:0.1.0")
}
```

## 📚 Usage
Here’s how you can use some of the components:

### 🔘 **Animated Button**
```kotlin
AnimatedButton(
    text = "Click Me",
    onClick = { /*TODO*/ },
    isLoading = false
)
```

### 💬 **Custom Dialog**
```kotlin
CustomDialog(
    title = "Delete Item?",
    message = "Are you sure you want to delete this?",
    onConfirm = { /* Delete action */ }
)
```

### 📝 **Expandable Text**
```kotlin
ExpandableText(
    text = "This is a long text that can be expanded or collapsed.",
    maxLines = 2
)
```

## 📌 Components Available (MVP v0.1.0)
- ✅ **Animated Button** (with loading state)
- ✅ **Custom Dialogs** (AlertDialog, BottomSheet, DatePicker)
- ✅ **Swipeable Cards** (Tinder-style gestures)
- ✅ **Custom Snackbar** (customizable actions & theming)
- ✅ **Expandable Text** ("Read More" component)

## 📢 Contributing
We welcome contributions from the community! To contribute:
1. **Fork** the repo.
2. Create a **feature branch**.
3. Submit a **pull request**.
4. Follow our [CONTRIBUTING.md](./CONTRIBUTING.md) guide.

## 🔗 License
This project is licensed under the **MIT License**. See [LICENSE](/LICENSE) for details.

---

### ⭐ Star the repo & share it with others to support the project!
