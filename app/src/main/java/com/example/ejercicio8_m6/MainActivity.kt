package com.example.ejercicio8_m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
[] 2 pantallas: Listado y detalle
[] dependencias: coil, Room, Retrofit, navigation, viewModel,
[] viewBinding
[] Permiso de Internet
[] Listado:
    [] RecyclerView + ViewHolder + Adapter
[] DEtalle
    [] RecyclerView + ViewHolder + Adapter

[] Remoto:
    [] Dataclass
    [] API(interfaz)
    [] Retrofit
[] Local:
    [] Database
    [] Entity
    [] DAO


 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}