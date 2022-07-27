package com.codeyuba.foodmarketkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.codeyuba.foodmarketkotlin.ui.auth.AuthActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            startActivity(Intent(
                this@SplashScreenActivity,
                AuthActivity::class.java))
        },3000)
    }
}