package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usuarioText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val contraseñaText = findViewById<EditText>(R.id.editTextTextPassword)
        val loginButton = findViewById<Button>(R.id.button)

        loginButton.setOnClickListener(){
            val usuario = usuarioText.text.toString()
            val contraseña = contraseñaText.text.toString()
            login(usuario, contraseña)
        }
    }

    fun login(usuario: String, contraseña: String){
        if (usuario == "stonescorpion10@hotmail.com" && contraseña == "12345"){
            val intent = Intent(this@LoginActivity, MainActivity2::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Acceso Correcto", Toast.LENGTH_SHORT).show()
        } else if(usuario != "stonescorpion10@hotmail.com" && contraseña != "12345") {
            Toast.makeText(applicationContext, "Datos Incorrectos", Toast.LENGTH_SHORT).show()
            findViewById<EditText>(R.id.editTextTextEmailAddress).setText("")
            findViewById<EditText>(R.id.editTextTextPassword).setText("")
        }
    }

    fun Crear(view: View){
        val intent = Intent(this@LoginActivity, CrearActivity::class.java)
        startActivity(intent)
    }
}