package com.thiago.nybooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thiago.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book> {
        return listOf<Book>(
                Book("Ttile 1", "Author 1"),
                Book("Ttile 2", "Author 2"),
                Book("Ttile 3", "Author 3"),
                Book("Ttile 4", "Author 4")
        )

    }
}