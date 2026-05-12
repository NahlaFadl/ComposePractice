package com.example.composeunlimited.tutorial.postCard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composeunlimited.R

val contentStyle = TextStyle(
    fontSize = 14.sp,
    color = Color.Black.copy(alpha = .66f)
)

val titleStyle = TextStyle(
    fontSize = 16.sp,
    color = Color.Black.copy(alpha = .87f),
    fontWeight = FontWeight.Medium
)

val subTitleStyle = TextStyle(
    fontSize = 12.sp,
    color = Color.Black.copy(alpha = .6f)
)