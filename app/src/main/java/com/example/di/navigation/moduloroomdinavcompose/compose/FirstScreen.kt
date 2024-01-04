package com.example.di.navigation.moduloroomdinavcompose.compose

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
internal fun FirstScreen(onClickNavigateTo:()->Unit) {
    Button(onClick = {
        Log.d("FirstScreen DI","OnClick")
        onClickNavigateTo()
    }) {
        Text(text = "To Second Screen DI")
    }
}