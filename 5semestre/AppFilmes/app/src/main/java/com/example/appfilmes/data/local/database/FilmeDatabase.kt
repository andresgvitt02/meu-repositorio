package com.example.appfilmes.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.appfilmes.data.local.dao.FilmeDao
import com.example.appfilmes.data.local.entities.Filme

@Database(entities = [Filme::class], version = 1, exportSchema = false)
abstract class FilmeDatabase : RoomDatabase() {
    abstract fun filmeDao(): FilmeDao

    companion object {
        @Volatile
        private var INSTANCE: FilmeDatabase? = null

        fun getDatabase(context: Context): FilmeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FilmeDatabase::class.java,
                    "filme_database"
                )
                    .fallbackToDestructiveMigration() // Adicione esta linha para desenvolvimento
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}