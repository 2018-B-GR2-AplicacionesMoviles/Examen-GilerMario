package com.example.mjg70.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_consultar.*

class ConsultarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultar)
        val adapter = ArrayAdapter<Medicina>(
            this,
            android.R.layout.simple_list_item_1,
            BDMedicina.mostrarMedicinas()
        )
        lstView.adapter = adapter;
        lstView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val medicinaSeleccionada = parent.getItemAtPosition(position) as Medicina
            val intentMedicinaSeleccionada = Intent(this, ActualizarActivity::class.java)
            intentMedicinaSeleccionada.putExtra("Medicina", medicinaSeleccionada)
            startActivity(intentMedicinaSeleccionada)
        }


    }
}
