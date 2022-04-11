package com.yantimirov_timur.composelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            TextButtonExample()
        }
    }
}

@Composable
fun TextButtonExample() {
    var btnContent by remember { mutableStateOf("I am button") }
    Button(onClick = { btnContent = "I am pressed" }){
        Text(text = btnContent)
    }
}