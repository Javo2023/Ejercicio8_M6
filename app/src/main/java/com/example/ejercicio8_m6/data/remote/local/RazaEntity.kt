package com.example.ejercicio8_m6.data.remote.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="tabla_razas")
class RazaEntity (
    @PrimaryKey val raza: String )

