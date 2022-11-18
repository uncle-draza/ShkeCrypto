package com.example.pma_projekat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView

class SignUpActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_sign_up)
        val switchToSignUpBtn = findViewById<TextView>(R.id.textView3)
        switchToSignUpBtn.setOnClickListener{
            val i = Intent(this, SignInActivity::class.java)
            startActivity(i)
        }
    }
}