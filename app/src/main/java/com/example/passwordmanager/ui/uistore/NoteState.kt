package com.example.passwordmanager.ui.uistore

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.passwordmanager.data.Entity

class NoteState (

    val listpassword: List<Entity> = emptyList(),
    val Account: MutableState<String> = mutableStateOf(""),
    val Username: MutableState<String> = mutableStateOf(""),
    val Password: MutableState<String> = mutableStateOf("")


)