package com.example.passwordmanager.ui.uistore

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputScreen(){
    Surface(modifier = Modifier.fillMaxSize()){
        Text(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
            text = Routing.USER_INPUT)
    }
}