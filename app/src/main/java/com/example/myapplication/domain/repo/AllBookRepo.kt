package com.example.myapplication.domain.repo

import com.example.myapplication.common.BookCategoryModel
import com.example.myapplication.common.BookModel
import com.example.myapplication.common.ResultState
import kotlinx.coroutines.flow.Flow

interface AllBookRepo {
    fun getAllBooks() : Flow<ResultState<List<BookModel>>>
    fun getAllCategory():Flow<ResultState<List<BookCategoryModel>>>
    fun getAllBooksByCategory(category : String) : Flow<ResultState<List<BookModel>>>
}