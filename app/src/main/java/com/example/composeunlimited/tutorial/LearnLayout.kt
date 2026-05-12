package com.example.composeunlimited.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.tutorial.style.myStyle


@Preview
@Composable
fun PreviewComponent() {
    FlowColumn(modifier = Modifier.fillMaxSize()
        .background(Color.White)
    ) {
        for (i in 0..10) {
            FirstComponent()
            SecondComponent()
            ThirdComponent()
        }
    }

//    FlowRow(modifier = Modifier.fillMaxSize()
//        .background(Color.White)
//    ) {
//        for (i in 0..10) {
//            FirstComponent()
//            SecondComponent()
//            ThirdComponent()
//        }
//    }

//    Box(modifier = Modifier
//        .width(300.dp)
//        .height(100.dp)
//        .background(Color.White)
//    ) {
//        FirstComponent()
//        SecondComponent(modifier = Modifier.align(Alignment.Center))
//        ThirdComponent(modifier = Modifier.align(Alignment.BottomEnd))
//    }
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceAround) {
//        FirstComponent()
//        SecondComponent()
//        ThirdComponent()
//    }

//    Row(modifier = Modifier
//        .fillMaxSize()
//        .background(Color.White),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceAround) {
//        FirstComponent()
//        SecondComponent()
//    }
}

@Composable
fun FirstComponent(modifier: Modifier = Modifier) {
    BasicText(
        "First ",
        modifier = modifier
            .background(Color.Yellow),
        style = myStyle,
    )
}

@Composable
fun SecondComponent(modifier: Modifier = Modifier) {
    BasicText(
        "Second ",
        style = myStyle,
        modifier = modifier
            .background(Color.Green),
    )
}

@Composable
fun ThirdComponent(modifier: Modifier = Modifier) {
    BasicText(
        "Third ",
        style = myStyle,
        modifier = modifier
            .background(Color.Blue),
    )
}