package com.example.ejercicio8_m6.data.remote

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.ejercicio8_m6.data.remote.local.RazaDao
import com.example.ejercicio8_m6.data.remote.local.RazaDetalleEntity
import com.example.ejercicio8_m6.data.remote.local.RazaEntity
import com.example.ejercicio8_m6.data.remote.remote.RazaApi

class Repositorio(private val razaApi: RazaApi, private val razaDao: RazaDao) {

    fun obtenerDetalle(id:String):LiveData<List<RazaDetalleEntity>> = razaDao.getImagesRaza(id)

    fun obtenerRazaEntity(): LiveData<List<RazaEntity>> = razaDao.getRazas()
    suspend fun getRazas() {
        val response = razaApi.getData()
        if (response.isSuccessful) {
            val message = response.body()!!.message
            val keys = message.keys
            keys.forEach {raza->
                //val razaEntity = RazaEntity(it)
                val razaEntity = raza.toRazaEntity()
                razaDao.insertarRaza(razaEntity)

            }

        } else {
            Log.e("repositorio", response.errorBody().toString())
        }
    }
    suspend fun getDetalleRaza(id: String) {
        val response = razaApi.getDetalleRaza(id)
        if (response.isSuccessful) {
            response.body()!!.message.forEach {url->
              //  val razaDetalleEntity = RazaDetalleEntity(id, it)  // esto se transformo para test unitario
                val razaDetalleEntity = url.toEntity(id) // esto viene del mapper

                razaDao.insertDetallePerro(razaDetalleEntity)
            }


        } else {
            Log.e("repositorio", response.errorBody().toString())
        }
    }



}