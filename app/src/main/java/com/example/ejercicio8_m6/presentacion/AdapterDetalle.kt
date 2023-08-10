package com.example.ejercicio8_m6.presentacion

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.ejercicio8_m6.data.remote.local.RazaDetalleEntity
import com.example.ejercicio8_m6.databinding.FragmentDetalleBinding
import com.example.ejercicio8_m6.databinding.ItemDetallePerroBinding

class AdapterDetalle : RecyclerView.Adapter<AdapterDetalle.DetallePerroViewHolder>() {

    lateinit var binding: ItemDetallePerroBinding
    private val listDetallePerro = mutableListOf<RazaDetalleEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallePerroViewHolder {
        binding = ItemDetallePerroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetallePerroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDetallePerro.size
    }

    override fun onBindViewHolder(holder: DetallePerroViewHolder, position: Int) {
        val perro = listDetallePerro[position]
        holder.bind(perro)
    }

    fun setDataDetalle(detalle: List<RazaDetalleEntity>) {
        this.listDetallePerro.clear()
        this.listDetallePerro.addAll(detalle)
        notifyDataSetChanged()
    }

    class DetallePerroViewHolder(val perrovista: ItemDetallePerroBinding) : RecyclerView.ViewHolder(perrovista.root){
        fun bind(detalle:RazaDetalleEntity){
            perrovista.imageDetalle.load(detalle.url)
        }

    }
}