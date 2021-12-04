package com.example.interacao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class MenuTela : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu_tela, container, false)

        val buttonNavSeg = view.findViewById<Button>(R.id.listaMercado)

        buttonNavSeg.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_menuTela_to_listFragment)
        }
        return view
    }
}