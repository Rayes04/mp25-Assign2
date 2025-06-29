package com.example.kalkulatorluas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val panjangInput = findViewById<EditText>(R.id.inputPanjang)
        val lebarInput = findViewById<EditText>(R.id.inputLebar)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val txtHasil = findViewById<TextView>(R.id.txtHasil)

        btnHitung.setOnClickListener {
            val panjang = panjangInput.text.toString().toDoubleOrNull()
            val lebar = lebarInput.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null) {
                val luas = panjang * lebar
                txtHasil.text = "Luas: $luas"
            } else {
                Toast.makeText(this, "Masukkan panjang dan lebar dengan benar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
