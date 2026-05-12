package com.example.composeunlimited.tutorial.postCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun Avatar(
    img: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = img,
        contentDescription = "Profile image",
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(12.dp))
    )
}