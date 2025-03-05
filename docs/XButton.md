# XButton - ComposeX UI Component

`XButton` is a customizable Jetpack Compose button designed for ComposeX. It follows Material 3 principles and offers various styles for different use cases.

## Features
✅ Fully customizable with different styles
✅ Supports loading state with a progress indicator
✅ Rounded ripple effect that follows the button shape
✅ Easy to extend and modify

## Usage
To use `XButton`, simply call it with a label and an `onClick` action:

```kotlin
XButton(text = "Click Me", onClick = { /* Handle click */ })
```

## Button Styles
`XButton` supports multiple styles that adapt to `MaterialTheme.colorScheme`:

### Primary Button
```kotlin
XButton(text = "Primary", style = XButtonStyle.default(), onClick = { /* Handle click */ })
```

### Secondary Button
```kotlin
XButton(text = "Secondary", style = XButtonStyle.secondary(), onClick = { /* Handle click */ })
```

### Outlined Button
```kotlin
XButton(text = "Outlined", style = XButtonStyle.outlined(), onClick = { /* Handle click */ })
```

### Tertiary Button
```kotlin
XButton(text = "Tertiary", style = XButtonStyle.tertiary(), onClick = { /* Handle click */ })
```

## Loading State
You can display a loading indicator instead of text:
```kotlin
XButton(text = "Loading", isLoading = true, style = XButtonStyle.primary(), onClick = {})
```

## Customization
You can customize the background color, text color, and shape:
```kotlin
XButton(
    text = "Custom",
    style = XButtonStyle(
        backgroundColor = Color.Green,
        textColor = Color.Black,
        shape = RoundedCornerShape(16.dp)
    ),
    onClick = {}
)
```

## Preview Screen
For testing and visualization, a preview screen showcases all button styles:
```kotlin
@Preview
@Composable
fun XButtonPreviewScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        XButton(text = "Primary", style = XButtonStyle.default(), onClick = {})
        XButton(text = "Secondary", style = XButtonStyle.secondary(), onClick = {})
        XButton(text = "Tertiary", style = XButtonStyle.tertiary(), onClick = {})
        XButton(text = "Outlined", style = XButtonStyle.outlined(), onClick = {})
        XButton(text = "Custom", style = XButtonStyle(backgroundColor = Color.Green, textColor = Color.Black, shape = RoundedCornerShape(16.dp)), onClick = {})
        XButton(text = "Loading", isLoading = true, onClick = {})
    }
}
```

## Next Steps
- Add support for icons (leading/trailing icons)
- Introduce different button sizes (Small, Medium, Large)
- Add disabled state support

---
This documentation provides a quick reference for integrating `XButton` into your ComposeX project. 🚀

