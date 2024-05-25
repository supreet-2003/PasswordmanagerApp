@file:JvmName("HomeScreenKt")

package com.example.passwordmanager.ui.uistore

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenAddNew(
        state: Homescr,
    navController: NavController,
    onEvents: (Events) -> Unit)
{

    Scaffold (

        floatingActionButton = {
            FloatingActionButton(onClick = {
                onEvents(
                    Events.SaveNote(
                        Account = state.Account.value,
                        Username = state.Username.value,
                        Password = state.Password.value
                    )
                )
                navController.popBackStack()
            }) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = null)

            }
        }
    ){
        Column (
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ){
            OutlinedTextField(value = state.Account.value, onValueChange = {
                state.Account.value = it
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                placeholder = {
                    Text(text = "Account")
                },
                textStyle = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)

            
            )


            OutlinedTextField(value = state.Username.value, onValueChange = {
                state.Username.value = it
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                placeholder = {
                    Text(text = "Username")
                },
                textStyle = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)


            )

            OutlinedTextField(value = state.Password.value, onValueChange = {
                state.Password.value = it
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                placeholder = {
                    Text(text = "Password")
                },
                textStyle = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)


            )

        }
    }
}