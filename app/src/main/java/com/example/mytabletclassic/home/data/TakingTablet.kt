package com.example.mytabletclassic.home.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
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
    val taking: String,
    val dosage: Int,
    @ColumnInfo(name="tablet_id")
    val tabletId: Int
)