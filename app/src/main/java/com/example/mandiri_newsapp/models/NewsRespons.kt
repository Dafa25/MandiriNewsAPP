package com.example.mandiri_newsapp.models

data class NewsRespons(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)