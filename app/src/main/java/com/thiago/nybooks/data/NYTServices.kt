package com.thiago.nybooks.data

import com.thiago.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String= "YNm81pkkHdmymK5J1oEHp07HDwGP6rVS",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}