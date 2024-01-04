package com.example.di.navigation.moduloroomdinavcompose.compose

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.di.navigation.libdbtwo.model.entity.User
import com.example.di.navigation.moduloroomdinavcompose.viewmodel.UserViewModel

@Composable
fun Form(userViewModel: UserViewModel, onClickNavigateTo:()->Unit) {
    LazyColumn {
        item{

            Button(onClick = { userViewModel.insert(User(0,firstName="Ernesto",lastName="Flores")) }) {
                Text(text = "Insertar")
            }

        }
        item{
            Button(onClick = {
                Log.d("FormScreen DI","OnClick")
                onClickNavigateTo()
            }) {
                Text(text = "Go to Data")

            }
        }
    }
}
