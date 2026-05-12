package com.example.composeunlimited.tutorial.state

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeunlimited.tutorial.style.myStyle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

val stateFlow: MutableStateFlow<Int> = MutableStateFlow(5)

@Composable
fun Test(
    viewModel: CounterViewModel = viewModel()
) {
//    var numValue: Int by rememberSaveable { mutableIntStateOf(5) }
//    var numValue: Int by remember { mutableIntStateOf(5) }
//    val thisComponentScope= rememberCoroutineScope()
//    val state by stateFlow.collectAsStateWithLifecycle()
    val numValue : Int by viewModel.state.collectAsStateWithLifecycle()
    FirstExample(
        numValue.toString(),
//        numValue.toString(),
//        state.toString(),
        onCrease = viewModel::increase
//            {
//            viewModel.state.intValue++
//            numValue++
//            thisComponentScope.launch{ stateFlow.emit(state+1) }
//        }
        ,
        onDecrease =viewModel::decrease
//            {
//            viewModel.state.intValue--
//            numValue--
//            thisComponentScope.launch{ stateFlow.emit(state-1)}
//        }
    )

}

@Composable
fun FirstExample(
    num: String,
    onCrease: () -> Unit,
    onDecrease: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
//        var numValue: Int by remember { mutableIntStateOf(5) }
        BasicText(
            text = num.toString(),
            style = myStyle
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            BasicText(
                text = "+",
                style = myStyle,
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .clickable { onCrease() })

            BasicText(
                text = "-",
                style = myStyle,
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .clickable { onDecrease() }
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    Test()
}