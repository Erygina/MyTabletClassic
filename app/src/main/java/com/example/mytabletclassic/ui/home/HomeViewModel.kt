package com.example.mytabletclassic.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.material.timepicker.TimeFormat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.sql.Time
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter

class HomeViewModel : ViewModel() {

    private val _uiState: MutableStateFlow<Tablet> = MutableStateFlow(Tablet())
    val uiState: StateFlow<Tablet> = _uiState

    data class Tablet(
        val name: String = "",
        val takingTabletTime: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm"),
        val dosage: Int = 0,
        val type: String = ""
    )
}