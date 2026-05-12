package com.example.composeunlimited.tutorial.style

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.R

@Composable
fun FirstImg(){
    Image(
        painter = painterResource(R.drawable.brid),
        contentDescription = stringResource(R.string.first_image),
        modifier = Modifier.size(200.dp).background(Color.Gray)
    )
}

@Preview
@Composable
fun FirstImgPreview(){
    FirstImg()
}