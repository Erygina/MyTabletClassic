package com.example.mytabletclassic.data.analysis

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Analysis (
    @PrimaryKey(autoGenerate = true) val id: Int,

    @ColumnInfo(name="name")
    val name: String,

//    @ColumnInfo(name="date")
//    val date: Date,

    @ColumnInfo(name="result")
    val result: Double
)