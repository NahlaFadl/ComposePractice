package com.example.composeunlimited.tutorial.homeScreen

import com.example.composeunlimited.tutorial.story.Story

data class HomeScreenState (
    val isLoading:Boolean = false,
    val posts: List<Post> = emptyList(),
    val stories : List<Story> = emptyList()
)