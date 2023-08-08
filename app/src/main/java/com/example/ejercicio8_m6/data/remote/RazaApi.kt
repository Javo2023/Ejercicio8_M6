package com.example.ejercicio8_m6.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface RazaApi {
    @GET("breads/list/all")
    suspend fun getData(): Response<Raza>
}