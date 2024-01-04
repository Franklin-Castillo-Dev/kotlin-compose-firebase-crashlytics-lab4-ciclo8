package com.example.di.navigation.moduloroomdinavcompose.viewmodel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class MyViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
)  : ViewModel() {

    init {
        Log.d(TAG,"onMyViewModel")
    }


    private val _contador= MutableStateFlow<Int>(0)
    val contador=_contador.asStateFlow()

    fun add(){
        _contador.value=_contador.value+1
    }
    fun reset(){
        _contador.value=0
    }

    companion object{
        const val TAG="MyViewModel"
    }
}