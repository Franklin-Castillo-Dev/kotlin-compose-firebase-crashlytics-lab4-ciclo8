package com.example.di.navigation.moduloroomdinavcompose.api

import com.example.di.navigation.moduloroomdinavcompose.api.dto.QuoteList
import retrofit2.Response
import retrofit2.http.GET

// Retrofit interface

interface QuotesApi {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}