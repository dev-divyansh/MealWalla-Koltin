package com.divyansh.mealwalla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.divyansh.mealwalla.databinding.ActivityMainBinding
import com.divyansh.mealwalla.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        binding.imageView8.setOnClickListener {
            Toast.makeText(this , "this is menu clicked" , Toast.LENGTH_SHORT).show()
        }
        binding.imageView9.setOnClickListener {
            Toast.makeText(this , "this is menu clicked" , Toast.LENGTH_SHORT).show()
        }

    }
}