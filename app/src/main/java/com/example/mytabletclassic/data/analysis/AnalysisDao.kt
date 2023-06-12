package com.example.mytabletclassic.data.analysis

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AnalysisDao {
    @Insert
    fun insertAnalysis(analysis: Analysis)

    @Query("SELECT * FROM analysis")
    fun getAllAnalysis(): List<Analysis>

    @Update
    fun updateAnalysis(analysis: Analysis)

    @Delete
    fun deleteAnalysis(analysis: Analysis)
}