package com.example.ejercicio8_m6.presentacion

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejercicio8_m6.data.remote.Repositorio
import com.example.ejercicio8_m6.data.remote.local.RazaDatabase
import com.example.ejercicio8_m6.data.remote.remote.RazaRetrofit
import kotlinx.coroutines.launch

class RazaViewModel (application: Application): AndroidViewModel(application){
    private val repositorio:Repositorio

    fun razaLiveData()=repositorio.obtenerRazaEntity()
    fun detalleLiveData()=repositorio.obtenerDetalle()
    init{
        val api = RazaRetrofit.getRetrofitRaza()
        val razaDatabase = RazaDatabase.getDataBase(application).getRazaDao()
        repositorio = Repositorio(api,razaDatabase)
    }
    fun getAllRazas() = viewModelScope.launch {
        repositorio.getRazas()
    }
    fun getDetallePerroVM(id:String) = viewModelScope.launch {
        repositorio.getDetalleRaza(id)
    }

}