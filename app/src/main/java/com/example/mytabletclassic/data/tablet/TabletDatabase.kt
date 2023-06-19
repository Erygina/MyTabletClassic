package com.example.mytabletclassic.data.tablet

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Tablet::class, TakingTablet::class], version = 1)
@TypeConverters(value = [DateConverter::class])
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

