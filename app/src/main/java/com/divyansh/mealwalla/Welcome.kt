package com.divyansh.mealwalla

import android.content.Intent
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
        binding.imageView9.setOnClickListener {
            var intent = Intent(this , main_menu :: class.java)
            startActivity(intent)

        }
        binding.bottomNav.setOnItemSelectedListener{
            when (it.itemId){
                R.id.cart -> {
                    var intent = Intent(this , cart :: class.java)
                    startActivity(intent)
                    true
            }
                R.id.profile -> {
                    var intent = Intent(this , profile :: class.java)
                    startActivity(intent)
                    true
            }
                R.id.support -> {
                    var intent = Intent(this , support:: class.java)
                    startActivity(intent)

                    true
                }
                else -> {
                    Toast.makeText(this , "error" , Toast.LENGTH_SHORT).show()
                    true
                }
            }

        }
    }
}