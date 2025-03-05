package com.albersa.composex.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    primaryContainer = PrimaryContainerColor,
    onPrimaryContainer = OnPrimaryContainerColor,

    secondary = SecondaryColor,
    onSecondary = OnSecondaryColor,
    secondaryContainer = SecondaryContainerColor,
    onSecondaryContainer = OnSecondaryContainerColor,

    tertiary = TertiaryColor,
    onTertiary = OnTertiaryColor,
    tertiaryContainer = TertiaryContainerColor,
    onTertiaryContainer = OnTertiaryContainerColor,

    background = BackgroundColor,
    onBackground = OnBackgroundColor,

    surface = SurfaceColor,
    onSurface = OnSurfaceColor,

    error = ErrorColor,
    onError = OnErrorColor,

    outline = OutlineColor
)


private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryColor,
    onPrimary = DarkOnPrimaryColor,
    primaryContainer = DarkPrimaryContainerColor,
    onPrimaryContainer = DarkOnPrimaryContainerColor,

    secondary = DarkSecondaryColor,
    onSecondary = DarkOnSecondaryColor,
    secondaryContainer = DarkSecondaryContainerColor,
    onSecondaryContainer = DarkOnSecondaryContainerColor,

    tertiary = DarkTertiaryColor,
    onTertiary = DarkOnTertiaryColor,
    tertiaryContainer = DarkTertiaryContainerColor,
    onTertiaryContainer = DarkOnTertiaryContainerColor,

    background = DarkBackgroundColor,
    onBackground = DarkOnBackgroundColor,

    surface = DarkSurfaceColor,
    onSurface = DarkOnSurfaceColor,

    error = DarkErrorColor,
    onError = DarkOnErrorColor,

    outline = DarkOutlineColor
)

@Composable
fun ComposeXTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, // ✅ Enable Dynamic Color Support
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
        content = content,
        shapes = ComposeXShapes
    )
}
