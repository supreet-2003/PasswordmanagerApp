package com.example.passwordmanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    val Account:String,
    val Username:String,
    val Password:String
)