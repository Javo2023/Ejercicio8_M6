package com.example.ejercicio8_m6.data.remote.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RazaRetrofit {
    companion object {
        private const val URL_BASE = "https://dog.ceo/api/"
        fun gesRetroFitRaza(): RazaApi {

            val mRetrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return mRetrofit.create(RazaApi::class.java)

        }
    }


}