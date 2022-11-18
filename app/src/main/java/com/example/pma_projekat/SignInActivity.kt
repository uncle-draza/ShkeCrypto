package com.example.pma_projekat

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.view.WindowCompat

class SignInActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_sign_in)

        val switchToSignUpBtn = findViewById<TextView>(R.id.textView3)
        switchToSignUpBtn.setOnClickListener{
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
        }
    }
}