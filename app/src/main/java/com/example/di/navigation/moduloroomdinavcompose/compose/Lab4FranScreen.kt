package com.example.di.navigation.moduloroomdinavcompose.compose

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
internal fun Lab4FranScreen(onClickNavigateTo:()->Unit) {
    

    
    Button(onClick = {
        onClickNavigateTo()
    }) {
        Text(text = "Ir a Pantalla de Crasheo. Franklin Castillo CC101020")
    }
}