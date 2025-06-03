package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ambil referensi dari komponen UI
        val inputJarak = findViewById<EditText>(R.id.inputJarak)
        val inputKecepatan = findViewById<EditText>(R.id.inputKecepatan)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val textResult = findViewById<TextView>(R.id.textResult)

        // Event klik tombol untuk menghitung waktu tempuh
        btnHitung.setOnClickListener {
            // Mengambil angka dari input
            val jarak = inputJarak.text.toString().toDoubleOrNull()
            val kecepatan = inputKecepatan.text.toString().toDoubleOrNull()

            // Validasi input
            if (jarak != null && kecepatan != null) {
                if (kecepatan > 0) {
                    val waktu = jarak / kecepatan
                    val jam = waktu.toInt()  // Ambil bagian jam
                    val menit = ((waktu - jam) * 60).toInt() // Ambil bagian menit
                    textResult.text = "Waktu Tempuh: $jam jam $menit menit"
                } else {
                    textResult.text = "Kecepatan harus lebih dari 0!"
                }
            } else {
                textResult.text = "Masukkan angka yang valid!"
            }
        }
    }
}
