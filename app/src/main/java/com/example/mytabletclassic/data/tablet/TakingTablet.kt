package com.example.mytabletclassic.data.tablet

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.android.material.timepicker.TimeFormat
import java.sql.Date
import java.sql.Time
import java.text.DateFormat
import java.text.SimpleDateFormat

@Entity(
    foreignKeys = [ForeignKey(
        entity = Tablet::class,
        parentColumns = ["id"],
        childColumns = ["tablet_id"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class TakingTablet(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    // Название приема
    @ColumnInfo(name="taking_name")
    val takingName: String,

    @ColumnInfo(name="geometry")
    val dosage: Int,

    @ColumnInfo(name="number_of_times")
    val numberOfTimes: Int,

    // Начало курса
//    @ColumnInfo(name="start_course")
//    val startCourse: Date,

    // Конец курса
//    @ColumnInfo(name="stop_course")
//    val stopCourse: Date,

    // Время каждого приема
//    @ColumnInfo(name="taking_notification")
//    val takingNotification: MutableMap<Int, Time>,

    // Закончен ли курс
    @ColumnInfo(name="is_over")
    val isOver: Boolean,

    @ColumnInfo(name="tablet_id")
    val tabletId: Int
)