@file:JvmName("HomeScreenKt")

package com.example.passwordmanager.ui.uistore

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenAddNew()
//        state: Homescr,
//    navController: NavController,
//    onEvents: (Events) -> Unit
{
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.52.dp, start = 15.71.dp, bottom = 601.48.dp, end = 207.29.dp)
    ){
        Text(text = "Password Manager")
        Column {
            FloatingActionButton(onClick = { }, modifier = Modifier.padding(top = 556.6.dp, start = 284.61.dp, bottom = 30.4.dp, end = 30.79.dp)) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = null)

            }
        }
    }











//    Scaffold (
//
//        floatingActionButton = {
//            FloatingActionButton(onClick = {
//                onEvents(
//                    Events.SaveNote(
//                        Account = state.Account.value,
//                        Username = state.Username.value,
//                        Password = state.Password.value
//                    )
//                )
//                navController.popBackStack()
//            }) {
//                Icon(imageVector = Icons.Rounded.Add, contentDescription = null)
//
//            }
//        }
//    ){
//        Column (
//            modifier = Modifier
//                .padding(top = 24.52.dp, start = 15.71.dp, bottom= 601.48.dp, end = 207.29.dp)
//                .fillMaxSize()
//        ){
//            Text(text = "Password Manager")
//
//        }
//    }
}