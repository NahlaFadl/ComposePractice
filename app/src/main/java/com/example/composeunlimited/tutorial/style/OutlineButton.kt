package com.example.composeunlimited.tutorial.style

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.tutorial.postCard.titleStyle

@Composable
fun OutlineButton(
    onClick: () -> Unit,
    caption: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    shape: Shape = RoundedCornerShape(16.dp),
    outlineColor: Color = Color.Gray,
    contentColor: Color = Color.Gray
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape =shape)
            .background(backgroundColor)
            .border(width = 1.dp, color = outlineColor,shape=shape)
            .clickable{onClick()}
            .padding(16.dp)
    ) {
        BasicText(
            text = caption,
            modifier= Modifier.align(alignment = Alignment.Center),
            style = titleStyle.copy(color = contentColor,),
        )
    }
}