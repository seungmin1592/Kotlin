package com.example.api_study.blog.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class WordCount(
    @Id
    val word: String,
    var cnt : Int = 0,
)