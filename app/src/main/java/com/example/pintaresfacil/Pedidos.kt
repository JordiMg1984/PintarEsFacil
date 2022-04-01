package com.example.pintaresfacil

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pedidos.*

class Pedidos: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedidos)





        //Boton esmaltes
        btnEsmaltes.setOnClickListener{
            val intent = Intent(this,Esmaltes::class.java)
            startActivity(intent);

        }





        //Boton volver al menu principal
         btnVolverPedidos.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent);

        }











    }
}
