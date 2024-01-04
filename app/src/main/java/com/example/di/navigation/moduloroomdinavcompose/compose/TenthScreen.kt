package com.example.di.navigation.moduloroomdinavcompose.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.example.di.navigation.moduloroomdinavcompose.model.TenthDataClass


@Composable
internal fun TenthScreen(uiState:State<TenthDataClass>,onDelete: (id:String) -> Unit,
                         onNavigateTo: (conversationId: String) -> Unit= {}
) {

    Column {
        Button(onClick = { onDelete(uiState.value.id) }) {
            Text(text = "TenthScreen. Delete on ViewModel with Id val =${uiState.value.id}")
        }

        Button(onClick = { onNavigateTo(uiState.value.id) }) {
            Text(text = "TenthScreen. Navigate to another compose ViewModel with Id val =${uiState.value.id}")
        }
    }



}