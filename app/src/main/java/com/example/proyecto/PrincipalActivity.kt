package com.example.proyecto

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }
    fun Menu(view: View){
        val intent = Intent(this@PrincipalActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}