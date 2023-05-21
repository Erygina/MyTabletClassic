package com.example.mytabletclassic.home.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

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