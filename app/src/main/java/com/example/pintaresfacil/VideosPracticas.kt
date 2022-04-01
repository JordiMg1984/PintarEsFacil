package com.example.pintaresfacil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.videotutoriales.*
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class VideosPracticas : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videotutoriales)

         val arrayAdapter: ArrayAdapter<*>

        val valores = mutableListOf ("Cómo pintar paredes en interior", "Pintar hierro en exteriores",
            "Trucos para pintar madera")

        val listVideotutorial = findViewById<ListView>(R.id.listVideotutorial)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,valores)
        listVideotutorial.adapter = arrayAdapter



            listVideotutorial.setOnItemClickListener { parent, view, position, id ->
                println("selected: $position")
                // Proceso


                if(position==0){
                    val openURL = Intent(android.content.Intent.ACTION_VIEW)
                    openURL.data = Uri.parse("https://www.youtube.com/watch?v=RlYoZR_VY3Q/")
                    startActivity(openURL)

                }

                if(position==1){
                    val openURL = Intent(android.content.Intent.ACTION_VIEW)
                    openURL.data = Uri.parse("https://www.youtube.com/watch?v=ytA5Lo8SF-s")
                    startActivity(openURL)

                }

                if(position==2){
                    val openURL = Intent(android.content.Intent.ACTION_VIEW)
                    openURL.data = Uri.parse("https://www.youtube.com/watch?v=3lqo1Ju7joE")
                    startActivity(openURL)

                }
            }

   }


}