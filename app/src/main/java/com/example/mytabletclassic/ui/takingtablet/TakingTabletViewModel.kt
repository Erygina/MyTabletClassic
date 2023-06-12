package com.example.mytabletclassic.ui.takingtablet

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TakingTabletViewModel : ViewModel() {
    val startDate: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val endDate: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val time: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}