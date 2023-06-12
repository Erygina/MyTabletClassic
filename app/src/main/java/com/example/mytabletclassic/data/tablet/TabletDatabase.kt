package com.example.mytabletclassic.data.tablet

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Tablet::class, TakingTablet::class], version = 1)
abstract class TabletDatabase: RoomDatabase() {
    abstract fun tabletDao(): TabletDao
    abstract fun takingTabletDao(): TakingTabletDao

    companion object{
        fun getTabletDb(context: Context): TabletDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                TabletDatabase::class.java,
                "tablet.db"
            ).build()
        }
    }
}