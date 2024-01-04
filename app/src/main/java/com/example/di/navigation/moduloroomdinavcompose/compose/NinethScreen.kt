package com.example.di.navigation.moduloroomdinavcompose.compose

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class NinethScreen {
}

@Composable
internal fun NinethScreen(
    onClickNavigateTo: (arg:String)->Unit = {}) {
    Button(onClick = {
        Log.d("NinethScreen DI","OnClick")
        val myArg = "1"
        onClickNavigateTo(myArg)
    }) {
        Text(text = "NinethScreen  DI")
    }

}