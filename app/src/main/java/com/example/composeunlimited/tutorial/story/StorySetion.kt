package com.example.composeunlimited.tutorial.story

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StorySection() {
    LazyRow(
        modifier = Modifier.width(200.dp),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(stories) { story ->
            StoryCircle(
                profilePicture = painterResource(story.profilePicture),
                isSeen = story.isSeen
            ) { }
        }
    }
}

@Preview
@Composable
fun StorySectionPreview() {
    StorySection()
}