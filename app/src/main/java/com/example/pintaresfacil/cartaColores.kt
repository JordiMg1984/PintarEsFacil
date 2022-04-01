package com.example.pintaresfacil

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class cartaColores: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carta_colores)

        val arrayAdapter: ArrayAdapter<*>

        val valores = mutableListOf ("Carta colores para paredes interiores", "Carta colores interiores en tonos pasteles",
            "Carta de colores para madera/hierro en esmalte al agua satinado","Carta colores paredes en exterior",
        "Carta de colores esmaltes al disolvente")

        val listaCartaColores = findViewById<ListView>(R.id.listCartaColores)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,valores)
        listaCartaColores.adapter = arrayAdapter



        listaCartaColores.setOnItemClickListener { parent, view, position, id ->
            println("selected: $position")
            // Proceso


            if(position==0){
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.tollens.es/busqueda-de-color?collection=cromology-interior")
                startActivity(openURL)

            }

            if(position==1){
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.tollens.es/busqueda-de-color?collection=cromology-pasteles")
                startActivity(openURL)

            }

            if(position==2){
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.tollens.es/busqueda-de-color?collection=esmalte-agua-satinado")
                startActivity(openURL)

            }

            if(position==3){
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://reveton.com/carta-colores-proyecta-315-colores/")
                startActivity(openURL)

            }

            if(position==4){
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://reveton.com/web/wp-content/uploads/2020/11/carta-esmalte-sintetico-brillante.pdf")
                startActivity(openURL)

            }


        }



    }
}