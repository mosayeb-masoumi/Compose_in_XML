package com.example.composeinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findViewById<ComposeView>(R.id.compose_view).setContent {
//            ComposeBtn()
//        }
    }
}

//@Composable
//fun ComposeBtn() {
//
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Green.copy(alpha = 0.4f)),
//        contentAlignment = Alignment.Center
//    ) {
//        Button(onClick = { /*TODO*/ }) {
//            Text(text = "btn from compose")
//        }
//    }
//}