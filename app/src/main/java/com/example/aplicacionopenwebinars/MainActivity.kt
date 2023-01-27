package com.example.aplicacionopenwebinars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplicacionopenwebinars.ui.theme.AplicacionOpenWebinarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        //modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            MySquare(miColor = Color.Black, tamanho = 80)
            MySquare(miColor = Color.Green, tamanho = 180)

        }
    }
}


@Composable
fun MySquare(miColor: Color, tamanho: Int) {
    Surface(
        color = miColor,
        modifier = Modifier.size(tamanho.dp)
    ) {

    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    AplicacionOpenWebinarsTheme {
        MainScreen()
    }
}