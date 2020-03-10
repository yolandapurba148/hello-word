package com.example.newone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AngkaViewModel :ViewModel() {
    private val _angka= MutableLiveData<Int>()
    init{
        _angka.value=0
    }
    
    val angka:LiveData<Int>
    get() =_angka

    fun tambah(){
        _angka.value = _angka.value?.plus(1)
    }

    fun kurang(){
        _angka.value = _angka.value?.minus(1)
    }
}