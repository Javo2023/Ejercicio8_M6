package com.example.ejercicio8_m6.data.remote.local

import androidx.room.Entity

@Entity(tableName = "tabla_razas_detalle", primaryKeys = ["razaDetalle","url"])
data class RazaDetalleEntity (
    val razaDetalle:String,
    val url: String
)