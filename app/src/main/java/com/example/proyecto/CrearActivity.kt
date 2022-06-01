package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CrearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)
    }

    fun Login(view: View){
        val intent = Intent(this@CrearActivity, LoginActivity::class.java)
        startActivity(intent)
    }
}