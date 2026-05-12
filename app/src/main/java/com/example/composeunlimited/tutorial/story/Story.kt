package com.example.composeunlimited.tutorial.story

import com.example.composeunlimited.R

data class Story(
    val profilePicture:Int,
    val isSeen: Boolean
)

val stories=listOf<Story>(
    Story(profilePicture = R.drawable.brid, isSeen = true),
    Story(profilePicture = R.drawable.dog, isSeen = false),
    Story(profilePicture = R.drawable.ic_launcher_foreground, isSeen = true),
    Story(profilePicture = R.drawable.dog_2, isSeen = false),
    Story(profilePicture = R.drawable.ic_launcher_background, isSeen = true),

)