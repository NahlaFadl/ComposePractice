package com.example.composeunlimited.tutorial.homeScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeunlimited.tutorial.story.Story
import com.example.composeunlimited.tutorial.story.getStories
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel(), HomeScreenInteractionListener {
    private val _state: MutableStateFlow<HomeScreenState> = MutableStateFlow(HomeScreenState())
    val state: StateFlow<HomeScreenState> = _state

    private var _effect: MutableSharedFlow<HomeSideEffect> = MutableSharedFlow()
    val effect: SharedFlow<HomeSideEffect> = _effect

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

    override fun onClickStory(story: Story) {
        viewModelScope.launch {
            _effect.emit(HomeSideEffect.ShowStory(story.id))
        }
    }

    override fun onClickPost(post: Post) {
        viewModelScope.launch {
            _effect.emit(HomeSideEffect.ShowPostDetails(post.id))
        }
    }

    override fun onClickCreatePost() {
        viewModelScope.launch {
            _effect.emit(HomeSideEffect.GoToCreatePostScreen)
        }
    }

}