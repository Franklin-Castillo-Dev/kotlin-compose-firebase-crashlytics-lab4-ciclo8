package com.example.di.navigation.moduloroomdinavcompose.compose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.di.navigation.moduloroomdinavcompose.api.dto.QuoteList
import com.example.di.navigation.moduloroomdinavcompose.api.dto.Result


@Composable
internal fun CrashlyticsScreen(
                             onNavigateTo: (conversationId: String) -> Unit= {}
) {


    LazyColumn{
        item{
            Button(onClick = { crashApp()  }) {
                Text(text = "CrashlyticsScreen. Provocar Crash")
            }
        }


    }

}

fun crashApp(){
    throw RuntimeException("Test Crash") // Force a crash
}