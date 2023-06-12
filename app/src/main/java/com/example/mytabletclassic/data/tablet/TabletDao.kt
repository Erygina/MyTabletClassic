package com.example.mytabletclassic.data.tablet

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TabletDao {
    @Insert
    fun insertTablet(tablet: Tablet)

    @Query("SELECT * FROM tablet")
    fun getAllTablet(): List<Tablet>

    @Query("SELECT * FROM tablet WHERE id=:id")
    fun getTabletById(id:Int): List<Tablet>

    @Update
    fun updateTablet(tablet: Tablet)

    @Delete
    fun deleteTablet(tablet: Tablet)
}