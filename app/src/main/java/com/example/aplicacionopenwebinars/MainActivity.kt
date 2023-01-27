package com.example.aplicacionopenwebinars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    val nameState = remember { mutableStateOf("") }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        MainLayout(
            name = nameState.value
        ){
            newName -> nameState.value = newName
        }
    }
}

@Composable
fun MainLayout(
    name: String,
    onTextFieldChange: (String) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        TextField(value = name, onValueChange = onTextFieldChange)
        Text(
            text = name
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    AplicacionOpenWebinarsTheme {
        MainScreen()
    }
}
