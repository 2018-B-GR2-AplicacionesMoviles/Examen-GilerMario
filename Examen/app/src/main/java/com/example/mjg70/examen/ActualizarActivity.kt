package com.example.mjg70.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actualizar.*

class ActualizarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar)
        val medicinaRecibida = intent.getParcelableExtra<Medicina>("Medicina")
        txtNombreMed.setText(medicinaRecibida.nombreMed.toString())
        txtCodigoMed.setText(medicinaRecibida.codigoMed.toString())
        txtPrecio.setText(medicinaRecibida.precioMed.toString())
        txtObservacionMed.setText(medicinaRecibida.observacionMed.toString())
        txtDosisMed.setText(medicinaRecibida.dosisMed.toString())
        btnBorrar.setOnClickListener { borrar() }
    }
    fun borrar(){
        BDMedicina.eliminarMedicina(txtNombreMed.text.toString())
    }
}
