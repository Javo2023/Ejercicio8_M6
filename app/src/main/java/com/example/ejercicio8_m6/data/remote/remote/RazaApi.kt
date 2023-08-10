package com.example.ejercicio8_m6.data.remote.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RazaApi {
    @GET("breeds/list/all")
    suspend fun getData(): Response<Raza>

    @GET("breed/{id}/images")
    suspend fun getDetalleRaza(@Path("id") id : String): Response<RazaDetalle>
}