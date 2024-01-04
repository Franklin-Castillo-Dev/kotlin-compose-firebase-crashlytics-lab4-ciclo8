package com.example.di.navigation.moduloroomdinavcompose.compose

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun SecondScreen(onClickNavigateTo:()->Unit) {

    Button(onClick = {
        Log.d("SecondScreen DI","OnClick")
        onClickNavigateTo()
    }) {
        Text(text = "To ThreethScreen Screen DI")
    }
}