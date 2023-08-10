package com.example.ejercicio8_m6.data.remote.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RazaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarRaza(razaEntity: RazaEntity)

    @Query("Select * from tabla_razas order by raza asc")
    fun getRazas(): LiveData<List<RazaEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetallePerro(razaDetalleEntity: RazaDetalleEntity)

    @Query("Select * from tabla_razas_detalle where razaDetalle like :id")
    fun getImagesRaza(id: String): LiveData<List<RazaDetalleEntity>>
}