# 🎨 ComposeX Theme System

ComposeX provides a customizable **Jetpack Compose theme system** with support for **Material You Dynamic Colors**, **light/dark themes**, **custom shapes**, and **typography with custom fonts**.

---

## 📌 Features
- ✅ **Material 3 Theme Support**
- ✅ **Light & Dark Mode**
- ✅ **Dynamic Color Support** (Android 12+)
- ✅ **Customizable Color Palettes & Typography**
- ✅ **Predefined Shape Styles**
- ✅ **Support for Custom Fonts**

---

## 🚀 How to Use ComposeX Theme

Wrap your app or screen inside `ComposeXTheme`:

```kotlin
@Composable
fun MyApp() {
    ComposeXTheme(dynamicColor = true) { // Enable Dynamic Color
        MyScreen()
    }
}
```

- **`dynamicColor = true`** → Uses **Material You** colors on Android 12+.
- **`dynamicColor = false`** → Uses **default color palettes** from ComposeX.

---

## 🎨 Color System
ComposeX defines default **light and dark color schemes** in `Colors.kt`.

### 🌞 Light Theme (from `Colors.kt`)
```kotlin
val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    background = BackgroundColor,
    surface = SurfaceColor,
    error = ErrorColor
)
```

### 🌙 Dark Theme (from `Colors.kt`)
```kotlin
val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryColor,
    secondary = DarkSecondaryColor,
    background = DarkBackgroundColor,
    surface = DarkSurfaceColor,
    error = DarkErrorColor
)
```

These colors are defined in `Colors.kt`.

---

## 🎨 Dynamic Color (Material You)
Dynamic colors adapt to the system wallpaper. To enable:

```kotlin
@Composable
fun ComposeXTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, // ✅ Enable Dynamic Colors
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colors = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    MaterialTheme(
        colorScheme = colors,
        typography = ComposeXTypography,
        shapes = ComposeXShapes, // ✅ Shapes applied here
        content = content
    )
}
```

📌 **Note:** Dynamic colors are **only available on Android 12+**. For older devices, ComposeX will fall back to default colors from `Colors.kt`.

---

## 🔤 Typography & Custom Fonts
ComposeX supports **custom fonts**, such as Roboto.

### **📂 Step 1: Add Font Files**
Move your selected `.ttf` font files into **`res/font/`**:

```
📂 app/src/main/res/font/
    ├── roboto_regular.ttf
    ├── roboto_medium.ttf
    ├── roboto_bold.ttf
```

### **📌 Step 2: Define the Font Family in `Typography.kt`**
```kotlin
val Roboto = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

val ComposeXTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )
)
```

### **📌 Step 3: Apply Typography in UI**
```kotlin
Text("This is Roboto Bold", style = MaterialTheme.typography.titleLarge)
Text("This is Roboto Regular", style = MaterialTheme.typography.bodyLarge)
```

📌 **Only include the `.ttf` files that you actually need!** If you don’t use Light, Black, or Italic styles, you don’t need to include them.

---

## 🔲 Shapes System
ComposeX provides predefined shapes for consistency across UI components. These are defined in `Shapes.kt`:

```kotlin
val ComposeXShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(24.dp)
)
```

### 📌 How to Use Shapes
You can apply shapes in your UI components:

#### **Example: Applying Shapes to a Card**
```kotlin
Card(
    shape = MaterialTheme.shapes.medium, // Uses 12.dp rounded corners
    modifier = Modifier.padding(16.dp)
) {
    Text("This card uses ComposeXShapes!", modifier = Modifier.padding(16.dp))
}
```

| Shape       | Usage Example (Default Material 3) |
|------------|--------------------------------|
| `extraSmall` (4.dp) | Chips, small buttons |
| `small` (8.dp) | TextFields, small containers |
| `medium` (12.dp) | Cards, larger buttons |
| `large` (16.dp) | Modals, dialogs |
| `extraLarge` (24.dp) | Large surfaces, sheets |

---

## 📄 Summary
✅ **Use `ComposeXTheme`** to apply theming.  
✅ **Enable `dynamicColor`** for Material You support.  
✅ **Customize colors, typography & shapes** using `MaterialTheme`.  
✅ **Use custom fonts by placing `.ttf` files in `res/font/` and defining them in `Typography.kt`**.

---

## 🛠 Next Steps
- Add **support for additional custom font families**.
- Implement **custom shape styles**.
- Create **prebuilt theme variants** (e.g., high contrast, brand colors).

🚀 **ComposeX Theme is now ready to use!**

