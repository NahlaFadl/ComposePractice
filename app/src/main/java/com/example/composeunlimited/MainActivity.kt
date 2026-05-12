package com.example.composeunlimited

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeunlimited.tutorial.FirstFoundationComponent
import com.example.composeunlimited.tutorial.postCard.PostCard
import com.example.composeunlimited.tutorial.state.FirstExample
import com.example.composeunlimited.tutorial.state.Test
import com.example.composeunlimited.ui.theme.ComposeUnlimitedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test()
//            FirstExample()
//            Column(Modifier.padding(92.dp)) {
////                var txtState by remember{ mutableStateOf("hello") }
////                Button(onClick = { txtState = "hello world"} ) {
////                    Icon(Icons.Filled.Menu,contentDescription = null)
////                    Text("Click me")
////                    Icon(Icons.Filled.Home, contentDescription = null)
////                }
////                FirstComposable(txtState)
//
//                FirstFoundationComponent()
//            }

//            PostCard(
//                painter = painterResource(R.drawable.brid),
//                profile = painterResource(R.drawable.ic_launcher_background),
//                publishName = "nala",
//                publishDate = "20/208",
//                content = "lkglkjdkjgkgj agsjgjlkg l;sklgjlkg rlklk"
//            )
        }
    }
}

@Composable
fun FirstComposable(state: String) {
    Text(state, color = Color.Red)
}

@Composable
@Preview
fun Preview(){
    FirstComposable("Test")
}