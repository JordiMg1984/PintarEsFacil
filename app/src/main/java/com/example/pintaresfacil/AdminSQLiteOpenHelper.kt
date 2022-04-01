package com.example.pintaresfacil


import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper


val DATABASENAME = "registroClientes"
val TABLENAME = "Clientes"
val KEY_NOMBRE = "nombre"
val KEY_APELLIDO = "apellido"
val KEY_DNI = "dni"
val KEY_EMAIL = "email"
val KEY_CONTRA = "contraseña"


class AdminSQLiteOpenHelper(context: Context, name: String, factory: CursorFactory?, version: Int) : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLENAME + " (" + KEY_NOMBRE + " VARCHAR(15)," + KEY_APELLIDO + " VARCHAR(60)," + KEY_DNI + " VARCHAR(10)" +
                KEY_EMAIL + "VARCHAR(20)" + KEY_CONTRA + "VARCHAR (10)"

        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Drop older table if exist
       // db.execSQL("DROP TABLE IF EXISTS " + TABLENAME")

    }

    fun insertUserDetails(nombre: String?, apellido: String?, dni: String?, email: String?,contra:String?) {
        //Get the Data Repository in write mode
        val db = this.writableDatabase
        //Create a new map of values, where column names are the keys
        val cValues = ContentValues()
        cValues.put(KEY_NOMBRE, nombre)
        cValues.put(KEY_APELLIDO, apellido)
        cValues.put(KEY_DNI, dni)
        cValues.put(KEY_EMAIL, email)
        cValues.put(KEY_CONTRA, contra)
        // Insert the new row, returning the primary key value of the new row
        val newRowId = db.insert(TABLENAME, null, cValues)
        db.close()
    }

    @SuppressLint("Range")
    fun GetUsers(): ArrayList<HashMap<String, String>>? {
        val db = this.writableDatabase
        val clientList: ArrayList<HashMap<String, String>> = ArrayList()
        val query = "SELECT * FROM registroClientes"
        val cursor: Cursor = db.rawQuery(query, null)
        while (cursor.moveToFirst()) {
            val user: HashMap<String, String> = HashMap()
            user["nombre"] = cursor.getString(cursor.getColumnIndex(KEY_NOMBRE))
            user["apellido"] = cursor.getString(cursor.getColumnIndex(KEY_APELLIDO))
            user["dni"] = cursor.getString(cursor.getColumnIndex(KEY_DNI))
            user["email"] = cursor.getString(cursor.getColumnIndex(KEY_EMAIL))
            user["contraseña"] = cursor.getString(cursor.getColumnIndex(KEY_CONTRA))

            clientList.add(user)
        }
        return clientList
    }



}