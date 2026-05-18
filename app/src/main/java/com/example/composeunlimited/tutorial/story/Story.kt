package com.example.composeunlimited.tutorial.story

import com.example.composeunlimited.R

data class Story(
    val id: Int,
    val profilePicture: Int,
    val isSeen: Boolean
)

fun getStories() = storiesItems
val storiesItems = listOf<Story>(
    Story(id = 1, profilePicture = R.drawable.brid, isSeen = true),
    Story(id = 2, profilePicture = R.drawable.dog, isSeen = false),
    Story(id = 3, profilePicture = R.drawable.ic_launcher_foreground, isSeen = true),
    Story(id = 4, profilePicture = R.drawable.dog_2, isSeen = false),
    Story(id = 5, profilePicture = R.drawable.ic_launcher_background, isSeen = true),

    )