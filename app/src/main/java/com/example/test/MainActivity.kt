package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)  // untuk memaksa light mode
        setContentView(binding.root)  /* menghubungkan dengan activity main dibawah dan ditampilkan ke UI */

        with(binding){/* supaya tidak perlu memanggil binding.--- terus menerus */
            cek.setOnClickListener{
                Toast.makeText(this@MainActivity, "Login berhasil, Selamat datang " + formName.text,Toast.LENGTH_LONG).show()
            }
            out.setOnClickListener{
                System.exit(0)
            }
        }
    }
}