package com.example.composeunlimited.tutorial.composeEffect

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.tutorial.style.myStyle
import kotlinx.coroutines.delay

@Composable
fun SomeUI(
    modifier: Modifier = Modifier
) {
    var state by remember { mutableIntStateOf(0) }
    var topPadding by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        doSomethingLogic()
        for (i in 1..200){
            delay(50)
            topPadding++
        }
    }
    BasicText(
        text = state.toString(),
        style = myStyle,
        modifier = modifier
            .fillMaxWidth()
            .padding( topPadding.dp).clickable { state++ }
    )
}

fun doSomethingLogic() {
    println("fetch data")
}