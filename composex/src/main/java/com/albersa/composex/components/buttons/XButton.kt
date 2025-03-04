package com.albersa.composex.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.albersa.composex.styles.XButtonStyle
import com.albersa.composex.theme.ComposeXTheme

@Composable
fun XButton(
    text: String,
    modifier: Modifier = Modifier,
    style: XButtonStyle = XButtonStyle.default(),
    isLoading: Boolean = false,
    onClick: () -> Unit
) {
    val borderModifier = style.borderColor?.let {
        Modifier.border(2.dp, it, style.shape)
    } ?: Modifier

    Box(
        modifier = modifier
            .then(borderModifier)
            .background(style.backgroundColor, shape = style.shape)
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        if (isLoading) {
            CircularProgressIndicator(color = style.textColor, strokeWidth = 2.dp, modifier = Modifier.size(18.dp))
        } else {
            Text(text, color = style.textColor, style = TextStyle(fontSize = 16.sp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun XButton_Preview() {
    ComposeXTheme(dynamicColor = false) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            XButton(text = "Primary", onClick = {})
            XButton(text = "Secondary", style = XButtonStyle.secondary(), onClick = {})
            XButton(text = "Outlined", style = XButtonStyle.outlined(), onClick = {})
            XButton(text = "Loading", isLoading = true, onClick = {})
        }
    }
}

@Preview(showBackground = true, backgroundColor = 2343435455)
@Composable
fun XButtonFullWidth_Preview() {
    ComposeXTheme(dynamicColor = false) {
        Column(
            modifier = Modifier.fillMaxSize().padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            XButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Primary",
                onClick = {}
            )
            XButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Secondary",
                style = XButtonStyle.secondary(),
                onClick = {}
            )
            XButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Outlined",
                style = XButtonStyle.outlined(),
                onClick = {}
            )
            XButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Loading",
                isLoading = true,
                onClick = {}
            )
        }
    }
}