package com.example.composeunlimited.tutorial.story

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun StoryCircle(
    modifier: Modifier = Modifier,
    profilePicture: Painter,
    isSeen: Boolean,
    onClick: () -> Unit,
) {
    val borderColor = if (isSeen) Color.Transparent else Color.Blue
    Box(
        modifier = modifier
            .size(96.dp)
            .clip(CircleShape)
            .border(width = 2.dp, color = borderColor, shape = CircleShape)
            .padding(4.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = profilePicture,
            contentDescription = "Profile picture",
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
                .clickable { onClick() },
            contentScale = ContentScale.FillBounds
        )
    }
}