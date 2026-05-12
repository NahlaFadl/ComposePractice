package com.example.composeunlimited.tutorial.lazyGrids

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.R
import com.example.composeunlimited.tutorial.style.Card
import com.example.composeunlimited.tutorial.style.myStyle

val imgsList = listOf(
    R.drawable.brid,
    R.drawable.ic_launcher_background,
    R.drawable.ic_launcher_foreground,
    R.drawable.dog,
    R.drawable.dog_2
)

@Composable
fun StaggeredGridExample() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(minSize = 128.dp),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF4F4F4)),
        contentPadding = PaddingValues(16.dp),
        verticalItemSpacing = 8.dp,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        items(imgsList) { img ->
            ImgCard2(
                img = painterResource(img)
            )
        }
    }
}

@Composable
fun ImgCard2(
    modifier: Modifier = Modifier,
    img: Painter
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = img,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview(device = "spec:parent=pixel_5,orientation=portrait")
@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun StaggeredGridExamplePreview() {
    StaggeredGridExample()
}