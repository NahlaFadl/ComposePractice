package com.example.composeunlimited

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeunlimited.tutorial.basicExample.ExpendableText
import com.example.composeunlimited.tutorial.basicExample.Test
import com.example.composeunlimited.tutorial.composeEffect.SomeUI
import com.example.composeunlimited.tutorial.homeScreen.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            SomeUI()
            HomeScreen()
//            ExpendableText(
//                text = " tekdjkdjskjdsa \n kjsdakjsdkljsdak \n ljslkjsfdklfjsdkfjds \n kfdjskldsfjksfdj"
//            )
//            Test()
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