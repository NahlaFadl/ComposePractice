package com.example.composeunlimited.tutorial.postCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun PostHeader(
    modifier: Modifier = Modifier,
    profileImage: Painter,
    publishName: String,
    publishDate: String
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Avatar(profileImage)
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            BasicText(text = publishName, style = titleStyle)
            BasicText(text = publishDate, style = subTitleStyle)
        }
    }
}