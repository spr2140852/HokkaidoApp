package com.example.hokkaidoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.hokkaidoapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // グルメボタンが押されたときの処理
        binding.gourmetButton.setOnClickListener {
            // アニメーションの設定
            val button_animation = AnimationUtils.loadAnimation(
                this, com.example.hokkaidoapp.R.anim.button_animation
            )
            it.startAnimation(button_animation)

            onGourmetButtonTapped(it)
        }

        // 文化ボタンが押されたときの処理
        binding.cultureButton.setOnClickListener {
            // アニメーションの設定
            val button_animation = AnimationUtils.loadAnimation(
                this, com.example.hokkaidoapp.R.anim.button_animation
            )
            it.startAnimation(button_animation)

            onCultureButtonTapped(it)
        }

        // アクティビティボタンが押されたときの処理
        binding.activityButton.setOnClickListener {
            // アニメーションの設定
            val button_animation = AnimationUtils.loadAnimation(
                this, com.example.hokkaidoapp.R.anim.button_animation
            )
            it.startAnimation(button_animation)

            onActivityButtonTapped(it)
        }

        // 観光地ボタンが押されたときの処理
        binding.sightseeingButton.setOnClickListener {
            // アニメーションの設定
            val button_animation = AnimationUtils.loadAnimation(
                this, com.example.hokkaidoapp.R.anim.button_animation
            )
            it.startAnimation(button_animation)

            onSightseeingButtonTapped(it)
        }

        // その他ボタンが押されたときの処理
        binding.othersButton.setOnClickListener {
            // アニメーションの設定
            val button_animation = AnimationUtils.loadAnimation(
                this, com.example.hokkaidoapp.R.anim.button_animation
            )
            it.startAnimation(button_animation)

            onOthersButtonTapped(it)
        }
    }

    // グルメ紹介画面に遷移
    fun onGourmetButtonTapped(view: View?) {
        val intent = Intent(this, GourmetActivity::class.java)
        startActivity(intent)
    }

    // 文化紹介画面に遷移
    fun onCultureButtonTapped(view: View?) {
        val intent = Intent(this, CultureActivity::class.java)
        startActivity(intent)
    }

    // レジャー紹介画面に遷移
    fun onActivityButtonTapped(view: View?) {
        val intent = Intent(this, ActivityActivity::class.java)
        startActivity(intent)
    }

    // 観光紹介画面に遷移
    fun onSightseeingButtonTapped(view: View?) {
        val intent = Intent(this, SightseeingActivity::class.java)
        startActivity(intent)
    }

    fun onOthersButtonTapped(view: View?) {
        val intent = Intent(this, OthersActivity::class.java)
        startActivity(intent)
    }
}