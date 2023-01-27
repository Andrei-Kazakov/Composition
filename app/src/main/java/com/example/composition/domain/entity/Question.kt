package com.example.composition.domain.entity

data class Question(
    val sum: Int,
    val visibleNumbers: Int,
    val options: List<Int>
)