package com.example.hokkaidoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hokkaidoapp.databinding.ActivityGourmetBinding

class GourmetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGourmetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGourmetBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}