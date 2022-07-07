package com.example.hokkaidoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hokkaidoapp.databinding.ActivityActivityBinding

class ActivityActivity : AppCompatActivity() {
    private lateinit var binding: ActivityActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}