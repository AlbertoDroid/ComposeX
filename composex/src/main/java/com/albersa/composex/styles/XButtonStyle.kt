package com.albersa.composex.styles

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.albersa.composex.theme.ComposeXShapes

data class XButtonStyle(
    val backgroundColor: Color,
    val textColor: Color,
    val borderColor: Color? = null,
    val shape: Shape = ComposeXShapes.small
) {
    companion object {
        @Composable
        fun default() = XButtonStyle(
            backgroundColor = MaterialTheme.colorScheme.primaryContainer,
            textColor = MaterialTheme.colorScheme.onPrimaryContainer
        )

        @Composable
        fun secondary() = XButtonStyle(
            backgroundColor = MaterialTheme.colorScheme.secondaryContainer,
            textColor = MaterialTheme.colorScheme.onSecondaryContainer
        )

        @Composable
        fun outlined() = XButtonStyle(
            backgroundColor = Color.Transparent,
            textColor = MaterialTheme.colorScheme.primary,
            borderColor = MaterialTheme.colorScheme.primary
        )
    }
}
