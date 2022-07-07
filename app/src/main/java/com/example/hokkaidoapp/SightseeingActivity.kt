package com.example.hokkaidoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hokkaidoapp.databinding.ActivitySightseeingBinding

class SightseeingActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySightseeingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySightseeingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}