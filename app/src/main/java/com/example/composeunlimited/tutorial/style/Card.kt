package com.example.composeunlimited.tutorial.style

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun Card(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    backgroundColor:Color=Color.White,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape)
            .background(backgroundColor)
            .border(
                width = 1.dp,
                color = Color.Black.copy(alpha = 0.08f),
                shape = shape
            )
    ) {
        content()
    }
}