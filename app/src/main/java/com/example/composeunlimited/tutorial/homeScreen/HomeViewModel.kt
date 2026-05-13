package com.example.composeunlimited.tutorial.homeScreen

import androidx.lifecycle.ViewModel
import com.example.composeunlimited.tutorial.story.getStories
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {
    private val _state: MutableStateFlow<HomeScreenState> = MutableStateFlow(HomeScreenState())
    val state: StateFlow<HomeScreenState> = _state

    init {
        fetchStories()
        fetchPosts()
    }

    private fun fetchStories() {
        getStories().also { storiesResponse ->
            _state.update { oldStories ->
                oldStories.copy(stories = storiesResponse)

            }
        }
    }

    private fun fetchPosts() {
        getFeed().also { postsResponse ->
            _state.update { oldPosts ->
                oldPosts.copy(posts = postsResponse)
            }
        }
    }

}