package com.thiago.nybooks.data.repository

import com.thiago.nybooks.data.BooksResult

interface BooksRepository {

    fun getBooks(booksResultCallback: (result: BooksResult) -> Unit)
}