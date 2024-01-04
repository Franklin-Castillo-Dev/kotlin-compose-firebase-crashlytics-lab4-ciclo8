package com.example.di.navigation.moduloroomdinavcompose.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.example.di.navigation.moduloroomdinavcompose.api.dto.QuoteList
import com.example.di.navigation.moduloroomdinavcompose.api.dto.Result
import com.example.di.navigation.moduloroomdinavcompose.model.TenthDataClass


@Composable
internal fun ElevenApiScreen(uiState: QuoteList?, onLoad: () -> Unit,
                             onNavigateTo: (conversationId: String) -> Unit= {}
) {


    LazyColumn{
        item{
            Button(onClick = { onLoad() }) {
                Text(text = "ElevenApiScreen. OnLoad with ViewModel ")
            }
        }

        item {
            Button(onClick = { onNavigateTo("-1") }) {
                Text(text = "ElevenApiScreen. Navigate to another compose ")
            }
        }
        
        items(uiState!!.results){ item: Result ->  
            Text(text = item.author)
        }
        
    }



}