package com.example.di.navigation.moduloroomdinavcompose.compose

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



@Composable
internal fun SeventhScreen(
    onClickNavigateTo: (arg:String)->Unit = {}) {
    Button(onClick = {
        Log.d("SeventhScreen DI","OnClick")
        val myArg = "1"
        onClickNavigateTo(myArg)
    }) {
        Text(text = "SeventhScreen Screen DI")
    }

}