package com.example.mytabletclassic.analysis.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Analysis (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val result: Double
)