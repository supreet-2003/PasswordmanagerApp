package com.example.passwordmanager.ui.uistore

import android.provider.ContactsContract.CommonDataKinds.Note

sealed interface Events {
    data class DeleteAccount(var note:Note):Events
    data class SaveNote(
        var Account:String,
        var Username:String,
        var Password:String,


        ):Events

}