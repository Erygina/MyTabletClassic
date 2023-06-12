package com.example.mytabletclassic.data.tablet

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.DateFormat

@Entity
data class Tablet(
    @PrimaryKey(autoGenerate = true) val id:Int = 0,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="shelf_life")
    val shelfLife: String,

    @ColumnInfo(name="reserve")
    val reserve: Int,

    @ColumnInfo(name="unit_measurement")
    val unitMeasurement: String,
    )