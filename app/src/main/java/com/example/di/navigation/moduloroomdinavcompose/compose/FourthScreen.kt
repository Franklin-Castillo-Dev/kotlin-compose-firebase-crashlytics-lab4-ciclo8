package com.example.di.navigation.moduloroomdinavcompose.compose

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.di.navigation.libdbtwo.model.entity.User
import com.example.di.navigation.moduloroomdinavcompose.viewmodel.MyViewModel
import com.example.di.navigation.moduloroomdinavcompose.viewmodel.UserViewModel

@Composable
fun FourthScreen(userViewModel: UserViewModel ,onClickNavigateBack:()->Unit, onClickNavigateTo:()->Unit) {
    val listOfUserUiState by userViewModel.allUsers.collectAsState(initial = listOf<User>())

    LazyColumn {
        item {
            Button(onClick = {
                Log.d("FourthScreen DI","OnClick")
                onClickNavigateBack()
            }) {
                Text(text = "I am On Fourth Screen.  Go to First Screen DI")
            }
        }


        item{
            Button(onClick = {
                Log.d("FormScreen DI","OnClick")
                onClickNavigateTo()
            }) {
                Text(text = "I am On Fourth Screen.  Go to Form Screen DI")
            }
        }

        item {
            androidx.compose.material.Text("Header Four Screen")
        }
        // Add list of messages
        items(listOfUserUiState) { user ->
            androidx.compose.material.Text("UserId = ${user.id}")
            androidx.compose.material.Text("FirstName = ${user.firstName}")
        }

        item {
            androidx.compose.material.Text("Footer")
        }
    }



}