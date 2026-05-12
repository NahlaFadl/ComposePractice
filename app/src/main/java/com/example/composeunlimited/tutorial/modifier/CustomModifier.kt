package com.example.composeunlimited.tutorial.modifier

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Stable
fun Modifier.blueLine(): Modifier{
    return this.shadow(
        elevation = 4.dp,
        shape = RoundedCornerShape(16.dp),
        spotColor = Color.Blue
    )
}