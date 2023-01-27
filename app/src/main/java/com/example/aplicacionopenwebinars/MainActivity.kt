package com.example.aplicacionopenwebinars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
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
            StudentList()
        }
    }
}

@Composable
fun StudentList(){
    val students = remember{mutableStateListOf("Paco", "Manolo")}
    Column(modifier = Modifier.fillMaxWidth()){
        for(student in students){
            Text(text = student)
        }
        Button(onClick = {students.add("Pepe")}){

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    AplicacionOpenWebinarsTheme {
        StudentList()
    }
}