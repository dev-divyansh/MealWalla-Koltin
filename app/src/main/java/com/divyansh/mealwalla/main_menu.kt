package com.divyansh.mealwalla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyansh.mealwalla.databinding.ActivityMainBinding
import com.divyansh.mealwalla.databinding.ActivityMainMenuBinding

class main_menu : AppCompatActivity() {
    private lateinit var binding : ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}