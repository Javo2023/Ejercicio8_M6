package com.example.ejercicio8_m6.data.remote

import com.example.ejercicio8_m6.data.remote.local.RazaDao
import com.example.ejercicio8_m6.data.remote.local.RazaEntity
import com.example.ejercicio8_m6.data.remote.remote.RazaApi
import retrofit2.Response

class Repositorio (private val razaApi: RazaApi, private val razaDao: RazaDao) {

    suspend fun getRazas(){
        val response = razaApi.getData()
        if(response.isSuccessful){
            val message = response.body()!!.message


            val keys = message.keys

            keys.forEach {
                val razaEntity = RazaEntity(it)
                razaDao.insertarRaza(razaEntity)

            }

        }

    }

}