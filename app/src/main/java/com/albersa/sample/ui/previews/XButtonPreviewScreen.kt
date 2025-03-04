package com.albersa.sample.ui.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.albersa.composex.components.buttons.XButton
import com.albersa.composex.styles.XButtonStyle
import com.albersa.composex.theme.ComposeXShapes
import com.albersa.composex.theme.ComposeXTheme

@Composable
fun XButtonPreviewScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        XButton(text = "Primary", onClick = {})
        XButton(text = "Secondary", style = XButtonStyle.secondary(), onClick = {})
        XButton(text = "Tertiary", style = XButtonStyle.tertiary(), onClick = {})
        XButton(text = "Outlined", style = XButtonStyle.outlined(), onClick = {})
        XButton(text = "Custom", style = XButtonStyle(backgroundColor = Color.Green, textColor = Color.Black, shape = ComposeXShapes.extraLarge), onClick = {})
        XButton(text = "Loading", isLoading = true, style = XButtonStyle.default(), onClick = {})
        XButton(text = "Primary", style = XButtonStyle.default(), onClick = {}, modifier = Modifier.fillMaxWidth())
        XButton(text = "Secondary", style = XButtonStyle.secondary(), onClick = {}, modifier = Modifier.fillMaxWidth())
        XButton(text = "Tertiary", isLoading = true, onClick = {}, modifier = Modifier.fillMaxWidth())
    }
}

@Preview(showBackground = true)
@Composable
fun LightThemePreview(modifier: Modifier = Modifier) {
    ComposeXTheme(darkTheme = false, dynamicColor = false) {
        XButtonPreviewScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun DarkThemePreview(modifier: Modifier = Modifier) {
    ComposeXTheme(darkTheme = true, dynamicColor = false) {
        XButtonPreviewScreen()
    }
}