package com.example.passwordmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.passwordmanager.ui.theme.PasswordManagerTheme
import com.example.passwordmanager.ui.uistore.HomeScreenAddNew
import com.example.passwordmanager.ui.uistore.Homescr

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PasswordManagerTheme {
                PasswordApp()
            }
        }
    }

    @Composable
    fun PasswordApp() {
         HomeScreenAddNew()
//       Image(painter = painterResource(id = R.drawable.cred), contentDescription = null,Modifier
//            .fillMaxSize()
//            .padding(top = 119.17.dp, start = 14.54.dp, end = 15.46.dp, bottom = 494.65.dp))
    }

    @Preview
    @Composable
    fun GreetingPreview() {
        PasswordManagerTheme {
           PasswordApp()
        }

    }
}


