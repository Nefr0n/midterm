package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Offer
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/offer_list")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    interface ApiService {
        @GET("offers")
        suspend fun getOffers(): Response<List<Offer>> //
    }
}