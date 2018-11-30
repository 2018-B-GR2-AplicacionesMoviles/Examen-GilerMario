package com.example.mjg70.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar.*

class IngresarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)

        btnAceptar.setOnClickListener { aceptarIngreso() }
        btnCancelar.setOnClickListener { cancelarIngreso()}
    }

    fun cancelarIngreso(){
        val intentCancelar= Intent(this, MainActivity::class.java)
        startActivity(intentCancelar)
    }

    fun aceptarIngreso(){

        val nombreMed= txtNombreMed.text.toString()
        val codigoMed= txtCodigoMed.text.toString()
        val precioMed= txtPrecio.text.toString()
        val observacionMed= txtObservacionMed.text.toString()
        val dosisMed= txtDosisMed.text.toString()

        val medicina= Medicina(nombreMed = nombreMed,
            codigoMed = codigoMed,
            precioMed = precioMed,
            observacionMed = observacionMed,
            dosisMed = dosisMed)
        val retorno = Intent(this, MainActivity::class.java)
        startActivity(retorno)
        BDMedicina.agregarMedicina(medicina)

    }
}
