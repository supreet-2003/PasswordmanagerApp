package com.example.passwordmanager.ui.uistore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.passwordmanager.ui.theme.Pink80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    state: Homescr,
    navController: NavController,
    onEvents: (Events) -> Unit
) {

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.Black)
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Password Manager", modifier = Modifier.weight(1f), color = Color.White)
            }
        },
        floatingActionButton = {
            FloatingActionButton(containerColor = Pink80, onClick = {
                state.Account.value = ""
                state.Username.value = ""
                state.Password.value = ""
                navController.navigate("HomeScreenAddNew")
            }) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = null)
            }
        }
    ) {
        LazyColumn(
            contentPadding = it,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(state.listpassword.size) {
                NoteItem(
                    state = state,
                    index = it,
                    onEvents = onEvents
                )
            }
        }

    }
}

@Composable
fun NoteItem(state: Homescr, index: Int, onEvents: (Events) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Red)
            .padding(10.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = state.listpassword.get(index = index).Account,
                fontSize = 16.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = state.listpassword.get(index = index).Username,
                fontSize = 10.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = state.listpassword.get(index = index).Password,
                fontSize = 8.sp,
                color = Color.White
            )

        }
        Icon(imageVector = Icons.Rounded.Delete, contentDescription = null, modifier = Modifier.size(35.dp))
    }

}
