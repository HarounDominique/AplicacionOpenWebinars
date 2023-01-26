package com.example.aplicacionopenwebinars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplicacionopenwebinars.ui.theme.AplicacionOpenWebinarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText(name = "World")
        }
    }
}


@Composable
fun GreetingText(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.button
        /*style = TextStyle(
            color = Color.Blue,
            fontStyle = FontStyle(1),
            fontWeight = FontWeight.Bold,
            fontSize = 108.sp
        )
        
         */
    )
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    AplicacionOpenWebinarsTheme {
        GreetingText(name = "World")
    }
}