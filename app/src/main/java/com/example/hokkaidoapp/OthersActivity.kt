package com.example.hokkaidoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hokkaidoapp.databinding.ActivityOthersBinding

class OthersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOthersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOthersBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}