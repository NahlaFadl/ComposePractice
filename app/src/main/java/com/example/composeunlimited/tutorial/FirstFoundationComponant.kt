package com.example.composeunlimited.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeunlimited.tutorial.modifier.blueLine
import com.example.composeunlimited.tutorial.style.EvenOdd
import com.example.composeunlimited.tutorial.style.myStyle

@Composable
fun FirstFoundationComponent() {
//    BasicText(text = buildAnnotatedString {
//        withStyle(SpanStyle(color = Color.Blue)){
//            append("@nahla")
//        }
//        withStyle(SpanStyle(color = Color.Black)){
//            append(" good morinig")
//        }
//    }
//    )

//    var txtValue by remember { mutableStateOf("hello") }
//
//    BasicTextField(
//        value = txtValue,
//        onValueChange = { txtValue = it },
//        textStyle = myStyle,
//        modifier = Modifier
//            .clip(RoundedCornerShape(16.dp))
//            .background(Color.Cyan)
//            .border(
//                width = 1.dp,
//                color = Color.Black,
//                shape = RoundedCornerShape(16.dp)
//            )
//            .padding(16.dp),
////        visualTransformation = PasswordVisualTransformation(),
////        keyboardOptions = KeyboardOptions(
////            capitalization = KeyboardCapitalization.Characters,
////            keyboardType = KeyboardType.Password
////        )
//    )

    var scaleFactor: Float by remember{ mutableStateOf(1f)}
    BasicText(
        text = "Hello",
        modifier = Modifier
//            .alpha(.5f)
//            .shadow(
//                elevation = 4.dp,
//                spotColor = Color.Yellow,
//                shape = RoundedCornerShape(16.dp)
//            )
//            .blueLine()
            .scale(scaleFactor)
            .blueLine()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Cyan)
            .clickable{
                if (scaleFactor >= 3f) scaleFactor -=.2f else scaleFactor += .2f
            }
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    )
}

@Preview
@Composable
fun Preview() {
    FirstFoundationComponent()
}