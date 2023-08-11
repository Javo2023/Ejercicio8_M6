package com.example.ejercicio8_m6.data.remote

import com.example.ejercicio8_m6.data.remote.local.RazaDetalleEntity
import com.example.ejercicio8_m6.data.remote.local.RazaEntity

fun String.toEntity(id:String): RazaDetalleEntity = RazaDetalleEntity(id,this)

fun String.toRazaEntity(): RazaEntity = RazaEntity(this)
