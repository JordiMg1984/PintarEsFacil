package com.example.pintaresfacil

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_principal.*

class menuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_principal)


        //Botón acceso videoturiales
        btnVideotutoriales.setOnClickListener{
            val intent = Intent(this,VideosPracticas::class.java)
            startActivity(intent);

        }
        //Botónn acceso a pedidos
        btnPedido.setOnClickListener{
            val intent = Intent(this,Pedidos::class.java)
            startActivity(intent);

        }



        //Bton cartaColores
        btnCartaColores.setOnClickListener{
            val intent = Intent(this,cartaColores::class.java)
            startActivity(intent);

        }

        //Bton cartaColores
        btnCarrito.setOnClickListener{
            val intent = Intent(this,carritoCompra::class.java)
            startActivity(intent);

        }

        //Mostarmos el nombre del cliente por pantalla

    }
}