package com.example.mytabletclassic.home.presentation.tablet

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TabletViewModel : ViewModel() {
    val tablets: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val cream: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val drops: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val vaccine: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }

    fun checkTablet(name: String){
        if(name == "tablet"){
            cream.postValue(false)
            drops.postValue(false)
            vaccine.postValue(false)
        }
        else if(name == "cream"){
            tablets.postValue(false)
            drops.postValue(false)
            vaccine.postValue(false)
        }
        else if(name=="drops"){
            cream.postValue(false)
            tablets.postValue(false)
            vaccine.postValue(false)
        }
        else {
            cream.postValue(false)
            drops.postValue(false)
            tablets.postValue(false)
        }
    }
}