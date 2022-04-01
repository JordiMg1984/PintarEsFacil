package com.example.pintaresfacil

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.registro_cliente.*


class RegistroCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_cliente)


        val admin = AdminSQLiteOpenHelper(this, "registroClientes", null, 1)
        val bd = admin.writableDatabase
        val registro = ContentValues()
        //Insertamos los datos
        btnValidarRegistro.setOnClickListener {




            val username: String = name.getText().toString().toString() + "\n"
            val location: String = loc.getText().toString()
            val designation: String = desig.getText().toString()
            val dbHandler = DbHandler(this@MainActivity)
            dbHandler.insertUserDetails(username, location, designation)
            intent = Intent(this@MainActivity, DetailsActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Details Inserted Successfully", Toast.LENGTH_SHORT)
                .show()

            }

        //Volvemos al menu principal
        btnMenuPrincipalRegistro.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent);
        }   }


}