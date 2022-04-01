package com.example.pintaresfacil

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.carritocompra.*

class carritoCompra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carritocompra)

        /**
        //Recibimos los datos de la ubicacion con bundle
        val bundle = intent.extras
        val dato = bundle?.getDouble("Latitude")
        val dato2= bundle?.getDouble("Longitude")
        Toast.makeText(this,dato,Toast.LENGTH_LONG).show()
        Toast.makeText(this,dato2,Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Ubicación recibida", Toast.LENGTH_SHORT).show()

**/

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.listaCarrito)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, users
        )
        mListView.adapter = arrayAdapter


        //Definimos los campos del spinner
        val spinner = findViewById(R.id.spinner) as Spinner
        val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(
            this, R.array.opciones, android.R.layout.simple_spinner_item
        )
        adaptador.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spinner.adapter = adaptador

        //Definimos el boton UbicacionGps
        btnUbicacion.setOnClickListener {
            val intent = Intent(this, ubicacionCliente::class.java)
            startActivity(intent);
        }


        //Definimos el boton Volver al Menu prinicpal
        btnVolverCarrito.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }


    }


    }

