package com.example.composeunlimited.tutorial.homeScreen

import androidx.compose.ui.res.painterResource
import com.example.composeunlimited.R
import com.example.composeunlimited.tutorial.postCard.PostCard

fun getFeed() = feedItems
val feedItems = listOf<Post>(
    Post(
        postImg = R.drawable.brid,
        profileImage = R.drawable.ic_launcher_background,
        publishName = "nala1",
        publishDate = "1/208",
        content = "post1"
    ),
    Post(
        postImg = R.drawable.brid,
        profileImage = R.drawable.ic_launcher_foreground,
        publishName = "nala2",
        publishDate = "2/208",
        content = "post2"
    ),
    Post(
        postImg = R.drawable.brid,
        profileImage = R.drawable.brid,
        publishName = "nala3",
        publishDate = "3/208",
        content = "post3"
    ),
    Post(
        postImg = R.drawable.ic_launcher_background,
        profileImage = R.drawable.ic_launcher_background,
        publishName = "nala4",
        publishDate = "4/208",
        content = "post4"
    ),
    Post(
        postImg = R.drawable.ic_launcher_background,
        profileImage = R.drawable.brid,
        publishName = "nala5",
        publishDate = "5/208",
        content = "post5"
    ),
)