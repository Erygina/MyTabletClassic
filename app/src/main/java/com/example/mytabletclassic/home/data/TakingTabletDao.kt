package com.example.mytabletclassic.home.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TakingTabletDao {
    @Insert
    fun insertTakingTablet(takingTablet: TakingTablet)

    @Query("SELECT * FROM takingTablet")
    fun getAllTakingTablet():List<TakingTablet>

    @Update
    fun updateTakingTablet(takingTablet: TakingTablet)

    @Delete
    fun deleteTakingTablet(takingTablet: TakingTablet)
}