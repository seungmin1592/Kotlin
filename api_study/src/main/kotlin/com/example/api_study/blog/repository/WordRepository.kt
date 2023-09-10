package com.example.api_study.blog.repository

import com.example.api_study.blog.entity.WordCount
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<WordCount, String>{
    fun findTop10ByOrderByCntDesc(): List<WordCount>
}
