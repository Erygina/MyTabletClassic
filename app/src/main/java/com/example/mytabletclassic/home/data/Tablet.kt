package com.example.mytabletclassic.home.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.DateFormat

@Entity
data class Tablet(
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    val name: String,
    val startCourse: String,
    val stopCourse: String,
    val shelfLife: String,
//    val dosage: Int,
    val reserve: Int,
    val unitMeasurement: String,
    )