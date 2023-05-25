package com.example.mytabletclassic.home.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Tablet::class], version = 1)
abstract class TakingTabletDatabase: RoomDatabase() {
    abstract fun takingTabletDao(): TakingTabletDao

    companion object{
        fun getTakingTabletBd(context: Context): TakingTabletDatabase{
            return Room.databaseBuilder(
                context.applicationContext,
                TakingTabletDatabase::class.java,
                "takingTablet.db"
            ).build()
        }
    }
}
