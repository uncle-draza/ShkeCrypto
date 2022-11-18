package com.example.pma_projekat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class SignUpActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_sign_up)
    }
}