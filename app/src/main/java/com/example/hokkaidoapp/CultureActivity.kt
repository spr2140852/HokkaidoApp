package com.example.hokkaidoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hokkaidoapp.databinding.ActivityCultureBinding

class CultureActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCultureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCultureBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}