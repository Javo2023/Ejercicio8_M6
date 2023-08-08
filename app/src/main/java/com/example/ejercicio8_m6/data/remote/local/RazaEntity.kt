package com.example.ejercicio8_m6.data.remote.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="tabla_razas")
class RazaEntity (val raza: String ) {
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}