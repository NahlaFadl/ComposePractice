package com.example.composeunlimited.tutorial.style

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composeunlimited.R

private val sharTech= FontFamily(
    Font(R.font.sharetech_regular, FontWeight.Normal)
)
val myStyle= TextStyle(
    color = Color.Red,
    fontSize = 20.sp,
    fontStyle = FontStyle.Italic,
    fontFamily = sharTech
)