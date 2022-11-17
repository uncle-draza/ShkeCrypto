package com.example.pma_projekat

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.core.view.WindowCompat

class SignInActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        //window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)


        //window.attributes.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        requestWindowFeature(Window.FEATURE_NO_TITLE)



        setContentView(R.layout.activity_sign_in)
    }
}