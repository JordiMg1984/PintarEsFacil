package com.example.pintaresfacil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.carritocompra.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Conultamos los datos apartir del Dni y la contraseña, luego mandamos el nombre de usuario a las otras activitys

        btnValidarIdentifica.setOnClickListener{
            val admin = AdminSQLiteOpenHelper(this, "registroClientes", null, 1)
            val bd = admin.writableDatabase

            //Consular el nombre del cliente através del DNI y la contraseña
            val fila = bd.rawQuery("select nombre from registroClientes where dni='${txtIdentificaDni.text}' " +
                    "and contraseña = '${txtPasswordIdentifica.text}'", null)



            if (fila.moveToFirst()) {

                mostrarDni.setText(fila.getString(0))


                //Toast.makeText(this, "Hola:",fila.getString(0),Toast.LENGTH_SHORT).show()
                val intent= Intent(this,menuPrincipal::class.java)
               // intent.putExtra("NombreCliente",fila)
                startActivity(intent);

            } else
                Toast.makeText(this, "No existe un cliente con estos Datos",  Toast.LENGTH_SHORT).show()
            bd.close()


        }




        //Boton para ir al registro cliente
        btnRegistro.setOnClickListener{
            val intent= Intent(this,RegistroCliente::class.java)
            startActivity(intent);
        }




    }
}