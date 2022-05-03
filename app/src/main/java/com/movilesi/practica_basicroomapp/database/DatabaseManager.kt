package com.movilesi.practica_basicroomapp.database

import android.content.Context
import androidx.room.Room

class DatabaseManager {
    lateinit var database: AppDatabase

    fun initializeDb(context: Context){
        createDb(context)
    }

    private fun createDb(context: Context){
        database = Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }

    companion object {
        val instance = DatabaseManager()
    }
}