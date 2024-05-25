package com.example.passwordmanager.data

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.room.Delete
import androidx.room.Upsert

interface DaoPass {

    @Upsert
    suspend fun upsertnote(pass:Entity)

    @Delete
    suspend fun deletenote(pass: Note)

}