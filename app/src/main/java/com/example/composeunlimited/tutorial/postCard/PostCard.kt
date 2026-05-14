package com.example.composeunlimited.tutorial.postCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.R
import com.example.composeunlimited.tutorial.style.Card

@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    painter: Painter,
    profile: Painter,
    publishName: String,
    publishDate: String,
    content: String,
    onLikeClick: () -> Unit = {}
) {

    Card(modifier = modifier) {
        PostHeader(
            modifier = Modifier.padding(12.dp),
            profileImage = profile,
            publishName = publishName,
            publishDate = publishDate
        )

        BasicText(
            text = content,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .padding(top = 4.dp, bottom = 12.dp),
            style = contentStyle
        )

        Image(
            painter = painter,
            contentDescription = "Post Image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
}

@Preview
@Composable
fun PostCardPreview() {
    PostCard(
        painter = painterResource(R.drawable.brid),
        profile = painterResource(R.drawable.ic_launcher_background),
        publishName = "nala",
        publishDate = "20/208",
        content = "lkglkjdkjgkgj agsjgjlkg l;sklgjlkg rlklk"
    )
}