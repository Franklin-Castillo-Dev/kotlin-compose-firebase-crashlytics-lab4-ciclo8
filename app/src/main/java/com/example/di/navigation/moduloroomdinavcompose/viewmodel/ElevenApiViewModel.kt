package com.example.di.navigation.moduloroomdinavcompose.viewmodel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.di.navigation.moduloroomdinavcompose.api.QuotesApi
import com.example.di.navigation.moduloroomdinavcompose.api.RetrofitHelper
import com.example.di.navigation.moduloroomdinavcompose.api.dto.QuoteList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class ElevenApiViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
)  : ViewModel() {
    //Referencia:  https://www.geeksforgeeks.org/retrofit-with-kotlin-coroutine-in-android/


    private val _apiResult= MutableStateFlow<QuoteList>(QuoteList())
    val apiResult = _apiResult.asStateFlow()

    val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)


    fun loadData(){
        viewModelScope.launch(Dispatchers.IO) {
            val result: Response<QuoteList> = quotesApi.getQuotes()
            if (result != null){
                // Checking the results
                Log.d(TAG, result.body().toString())
                result.body()?.let {
                    _apiResult.value= it
                }

            }
        }
    }

    companion object{
        const val TAG="ElevenApiViewModel"
    }
}