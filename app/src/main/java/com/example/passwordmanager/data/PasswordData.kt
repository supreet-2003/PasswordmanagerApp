package com.example.passwordmanager.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.passwordmanager.data.DaoPass
import org.openjdk.tools.javac.util.JCDiagnostic.Note

@Database(entities = [Note::class], version =1)
abstract class PasswordData: RoomDatabase() {
    abstract val dao: DaoPass
}