package com.example.composeunlimited.tutorial.adaptiveUi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AdaptiveHomeScreen() {
    BoxWithConstraints {
        if (maxWidth < 600.dp) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)) { }
        } else {
            Row(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(360.dp)
                        .background(Color.Green)
                ) { }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Red)) { }
            }
        }
    }
}

@Preview(device = "spec:parent=pixel_5,orientation=portrait")
@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun AdaptiveHomeScreenPreview() {
    AdaptiveHomeScreen()
}