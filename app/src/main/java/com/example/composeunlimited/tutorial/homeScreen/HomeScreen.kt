package com.example.composeunlimited.tutorial.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeunlimited.R
import com.example.composeunlimited.tutorial.postCard.PostCard
import com.example.composeunlimited.tutorial.postCard.titleStyle
import com.example.composeunlimited.tutorial.story.StoryCircle
import com.example.composeunlimited.tutorial.style.OutlineButton
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    val state: HomeScreenState by viewModel.state.collectAsStateWithLifecycle()
    LaunchedEffect(Unit) {
        viewModel.effect.collect { effect ->
            when (effect) {
                HomeSideEffect.GoToCreatePostScreen -> TODO()
                is HomeSideEffect.ShowPostDetails -> TODO()
                is HomeSideEffect.ShowStory -> TODO()
            }
        }
    }
    HomeContent(state, viewModel)
}

@Composable
fun HomeContent(
    state: HomeScreenState,
    listener: HomeScreenInteractionListener
) {
    val homeListState= rememberLazyListState()

    LaunchedEffect(Unit) {
        delay(3000)
        homeListState.animateScrollToItem(4)
    }

    LaunchedEffect(Unit) {
        snapshotFlow { homeListState.firstVisibleItemIndex}
            .collect {
                println("collecting list state is $it")
            }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F4F4)),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        state = homeListState
    ) {
        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(state.stories) { story ->
                    StoryCircle(
                        profilePicture = painterResource(story.profilePicture),
                        isSeen = story.isSeen
                    ) {
                        listener.onClickStory(story)
                    }
                }
            }
        }
        item {
            OutlineButton(
                onClick = { listener.onClickCreatePost() },
                caption = "Click me",
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }

        stickyHeader {
            BasicText(
                text = "Lastest Post",
                style = titleStyle.copy(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFFF4F4F4))
                    .padding(16.dp)
            )
        }

        items(state.posts) { post ->
            PostCard(
                painter = painterResource(post.postImg),
                profile = painterResource(post.profileImage),
                publishName = post.publishName,
                publishDate = post.publishDate,
                content = post.content,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                listener.onClickPost(post)
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}