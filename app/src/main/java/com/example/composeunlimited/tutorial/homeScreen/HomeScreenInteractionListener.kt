package com.example.composeunlimited.tutorial.homeScreen

import com.example.composeunlimited.tutorial.story.Story

interface HomeScreenInteractionListener {
    fun onClickStory(story: Story)
    fun onClickPost(post: Post)
    fun onClickCreatePost()
}