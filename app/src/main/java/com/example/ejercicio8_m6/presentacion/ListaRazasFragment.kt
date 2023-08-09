package com.example.ejercicio8_m6.presentacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.ejercicio8_m6.R
import com.example.ejercicio8_m6.databinding.FragmentListaRazasBinding


class ListaRazasFragment : Fragment() {
   lateinit var binding: FragmentListaRazasBinding
   private val razaViewModel: RazaViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaRazasBinding.inflate(layoutInflater,container,false)
        initAdapter()
        razaViewModel.getAllRazas()
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun initAdapter() {
        val adapter = AdapterRazas()
        binding.recyclerView.adapter = adapter
        razaViewModel
    }


}