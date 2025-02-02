package com.example.textcomposableandmodifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textcomposableandmodifiers.ui.theme.TextComposableAndModifiersTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextComposableAndModifiersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*LearnText()*/
                    LearnTextAndModifiers()
                }
            }
        }
    }
}

@Composable
fun LearnText(){
    Text(text = "Hello World",
        color = Color.Red,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Cursive,
        fontSize = 33.sp
    )
}

@Composable
fun LearnTextAndModifiers(){
    val clickOnText = {}

    Text(text = stringResource(id = R.string.hello_string),
        color = Color.Red,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Serif,
        fontSize = 26.sp,
        modifier = Modifier
            .padding(22.dp)
            .background(Color.Gray)
            .clickable(onClick = clickOnText))
}

@Preview(showBackground = true)
@Composable
fun ShowPreView(){
    TextComposableAndModifiersTheme {
        LearnTextAndModifiers()
    }
}


