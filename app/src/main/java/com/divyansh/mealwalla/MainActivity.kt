package com.divyansh.mealwalla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyansh.mealwalla.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater )
        setContentView(binding.root)

        var intent = Intent(this@MainActivity , login::class.java)
        startActivity(intent)
        finish()

    }
}

