package com.example.retrofit.Utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class InitRetrofit {

    fun getInitRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(EndPoints.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getInitInstance(): ApiService {
        return getInitRetrofit().create(ApiService::class.java)


    }

}