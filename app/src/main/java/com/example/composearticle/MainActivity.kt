package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeWithText(
                        message = "Jetpack Compose Info",
                        info = "Jetpack Compose is a modern toolkit " +
                            "for building modern native Android UI. Compose simplifies and accelerates UI development on Android with less code, " +
                            "powerful tools, and intuitive Kotlin APIs. ",
                        para = " In this tutorial, you build a simple UI" +
                                "component with declarative functions." +
                                "You call compose functions to say what elements" +
                                "you want and the compose compiler does the rest. Compose is built around" +
                                "Composable functions. These functions let you define your app's " +
                                "UI programmatically because they let you describe how it should look and provide data" +
                                "dependencies, rather than focus on process of UI's construction, such as initializing an element and then attaching" +
                                "it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
                }
            }
        }
    }
}

@Composable
fun ComposeWithImage()
{
   val image= painterResource(id = R.drawable.bgcompose)
    Box {
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .fillMaxWidth(),
        )
    }

}
@Composable
fun ComposeWithText(message: String, info: String, para: String){
    Column{
        Text(
            text = message,
            fontSize = 24.sp,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp)
        )
        Text(
            text = info,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp,end = 16.dp)
        )
        Text(
            text = para,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp)
        )


    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        Column{
            ComposeWithImage()
            ComposeWithText(
                message = "Jetpack Compose Info",
                info = "Jetpack Compose is a modern toolkit " +
                        "for building modern native Android UI. Compose simplifies and accelerates UI development on Android with less code, " +
                        "powerful tools, and intuitive Kotlin APIs. ",
                para = " In this tutorial, you build a simple Ui" +
                        "component with declarative functions." +
                        "You call compose functions to say what elements" +
                        "you want and the compose compiler does the rest. Compse is built around" +
                        "Composable functions. These functions let you define your app's " +
                        "UI programmatically because they let you describe how it should look and provide data" +
                        "dependencies, rather than focus on process of Ui's construction, such as initializing an element and then attaching" +
                        "it to a parent. To create a Composable function, you add the @Composable annotion to the function name.")

        }
    }
}