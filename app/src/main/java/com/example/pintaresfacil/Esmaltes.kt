package com.example.pintaresfacil

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.esmaltes.*
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*


class Esmaltes: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.esmaltes)

        //Deficinimos la fich  a tecnica del esmalte al agua brillante
        fichaEsmalteAguaBrillo.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data =
                Uri.parse("https://www.tollens.es/download/fiche_technique/TOLES_8200/1/Esmalte+al+agua+alto+brillo-fiche_technique.pdf")
            startActivity(intent);
        }

            //Definimos la ficha tecnica del esmalte al agua satinado
            fichaEsmalteAguaSatin.setOnClickListener {
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data =
                    Uri.parse("https://www.tollens.es/download/fiche_technique/TOLES_8201/1/Esmalte+al+agua+satinado+seda-fiche_technique.pdf<")
                startActivity(intent);
            }

                //Definimos la ficha tecnica del esmalte al agua mate
                fichaEsmalteAguaMate.setOnClickListener {
                    val openURL = Intent(android.content.Intent.ACTION_VIEW)
                    openURL.data =
                        Uri.parse("https://www.tollens.es/download/fiche_technique/TOLES_8202/1/Esmalte+al+agua+extra+mate-fiche_technique.pdf")
                    startActivity(intent);

                }







    }

}










