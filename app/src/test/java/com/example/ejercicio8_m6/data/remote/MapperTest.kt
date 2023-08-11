package com.example.ejercicio8_m6.data.remote

import org.junit.Assert.*

import org.junit.Test

class MapperTest {

    @Test
    fun toEntity() {
        //Given
        val url = "http://example.com"
        val id = "id"


        //When
        val resultado = url.toEntity(id)

        //Then
        assertEquals(id, resultado.razaDetalle)
        assertEquals(url, resultado.url)

    }

    @Test
    fun toRazaEntity() {
        //Given
        val raza = "perro"


        //When
        val resultado = raza.toRazaEntity()

        //Then
        assertEquals(raza, resultado.raza)



    }
}