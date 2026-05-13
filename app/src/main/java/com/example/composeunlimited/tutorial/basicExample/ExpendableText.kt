package com.example.composeunlimited.tutorial.basicExample

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.tutorial.postCard.titleStyle

@Composable
fun ExpendableText(
    text: String,
    modifier: Modifier = Modifier
) {
//    var isExpandable:Boolean by retain { mutableStateOf(false) }
    var isExpandable: Boolean by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFF4F4F4))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BasicText(
            text,
            style = titleStyle,
            maxLines = if (isExpandable) Int.MAX_VALUE else 1,
        )
        BasicText(
            text = if (isExpandable) "Read less" else "Read more",
            modifier = Modifier
                .padding(top = 8.dp)
                .clickable { isExpandable = !isExpandable },
        )
    }

}

@Composable
@Preview
fun PreviewExpendableText() {
    ExpendableText(
        text = " tekdjkdjskjdsa \n kjsdakjsdkljsdak \n ljslkjsfdklfjsdkfjds \n kfdjskldsfjksfdj"
    )
}