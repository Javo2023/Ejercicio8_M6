package com.example.ejercicio8_m6.presentacion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio8_m6.data.remote.local.RazaEntity
import com.example.ejercicio8_m6.databinding.FragmentListaRazasBinding
import com.example.ejercicio8_m6.databinding.ItemBinding

class AdapterRazas: RecyclerView.Adapter<AdapterRazas.ItemViewHolder>() {
    lateinit var binding: ItemBinding
    private val listItem = mutableListOf<RazaEntity>()



    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int):
            AdapterRazas.ItemViewHolder {
       binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: AdapterRazas.ItemViewHolder, position: Int) {
       val raza = listItem[position]
        holder.bind(raza)
    }

    override fun getItemCount(): Int {
       return listItem.size
    }

    fun setData(razas:List<RazaEntity>){
        this.listItem.clear()
        this.listItem.addAll(razas)
        notifyDataSetChanged()

    }

    class ItemViewHolder (val razasVistas: ItemBinding) : RecyclerView.ViewHolder(razasVistas.root){

        fun bind(raza:RazaEntity){
            razasVistas.tvRaza.text = raza.raza

        }

    }
}