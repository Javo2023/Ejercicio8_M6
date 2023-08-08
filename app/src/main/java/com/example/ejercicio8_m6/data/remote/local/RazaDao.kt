package com.example.ejercicio8_m6.data.remote.local

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface RazaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarRaza(razaEntity: RazaEntity)

    @Query ("Select * from tabla_razas order by raza desc")
    fun getRazas(): LiveData<RazaEntity>
}