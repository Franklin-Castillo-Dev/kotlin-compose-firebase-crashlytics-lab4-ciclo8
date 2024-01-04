package com.example.di.navigation.moduloroomdinavcompose.compose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
internal fun Lab4FranCrashScreen(
    onNavigateTo: (conversationId: String) -> Unit= {}
) {


    LazyColumn{
        item{
            Button(onClick = { lab4CrashApp()  }) {
                Text(text = "Crashlytics. Provocar Crash. CC101020")
            }
        }


    }

}

fun lab4CrashApp(){
    throw RuntimeException("Crasheo App Lab 4.") // Force a crash
}