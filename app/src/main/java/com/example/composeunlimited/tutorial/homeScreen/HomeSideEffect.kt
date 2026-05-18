package com.example.composeunlimited.tutorial.homeScreen

sealed class HomeSideEffect {
    data class ShowStory(val id: Int) : HomeSideEffect()
    data class ShowPostDetails(val id: Int) : HomeSideEffect()
    object GoToCreatePostScreen : HomeSideEffect()
}