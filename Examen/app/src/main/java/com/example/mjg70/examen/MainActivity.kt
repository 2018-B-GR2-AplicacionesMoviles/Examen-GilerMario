package com.example.mjg70.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIngresar.setOnClickListener { ingresarMedicina() }
        btnConsultar.setOnClickListener { consultarMedicina() }
    }

    fun ingresarMedicina(){
        val intentIngresarMedicina= Intent(this, IngresarActivity::class.java)
        startActivity(intentIngresarMedicina)
    }

    fun consultarMedicina(){
        val intentConsultarMedicina = Intent(this, ConsultarActivity::class.java)
        startActivity(intentConsultarMedicina)
    }
}
