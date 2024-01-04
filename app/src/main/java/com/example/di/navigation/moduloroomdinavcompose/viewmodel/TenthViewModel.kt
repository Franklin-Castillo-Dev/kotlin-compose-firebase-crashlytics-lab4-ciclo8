package com.example.di.navigation.moduloroomdinavcompose.viewmodel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.di.navigation.moduloroomdinavcompose.model.TenthDataClass
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

//const val tenthViewModelIdArg = "tenthViewModelIdArg"


const val tenthViewModelIdArg = "tenthViewModelIdArg"

internal class TenthViewModelArgs(val attributeId: String) {
    constructor(savedStateHandle: SavedStateHandle) :
            this(checkNotNull(savedStateHandle[tenthViewModelIdArg]) as String)
}

class TenthViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
)  : ViewModel(){

    private val receivedArgs = TenthViewModelArgs(savedStateHandle)

    private val _dbRow= MutableStateFlow<TenthDataClass>(TenthDataClass(receivedArgs.attributeId,"",""))
    val uiState=_dbRow.asStateFlow()

    fun loadData(){
        _dbRow.value= TenthDataClass(receivedArgs.attributeId,"","")
    }

    public fun onDelete(id:String){
        //Code for deleting
        Log.d(TAG,"Deleting row with Id=${id}")
    }

    companion object{
        const val TAG="TenthViewModel"
    }

}