package com.example.di.navigation.moduloroomdinavcompose.api.dto

data class QuoteList(
    val count: Int=-1,
    val lastItemIndex: Int=-1,
    val page: Int = -1,
    val results: List<Result> = listOf<Result>(),
    val totalCount: Int = -1,
    val totalPages: Int = -1
)
