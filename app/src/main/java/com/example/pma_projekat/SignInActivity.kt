package com.example.pma_projekat

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.WindowCompat
import com.example.pma_projekat.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity()
{
    private lateinit var binding:ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        //Uklanjanje title bar-a
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        //Firebase Sign In
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()
        binding.button.setOnClickListener {
            val email = binding.emailET.text.toString()
            val pass = binding.pswdET.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty()) {
                    firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
            }
            else {
                Toast.makeText(this,"Fields cannot be empty!", Toast.LENGTH_SHORT).show()
            }
        }

        //Don't have an account? Sing up
        val switchToSignUpBtn = findViewById<TextView>(R.id.textView3)
        switchToSignUpBtn.setOnClickListener{
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
        }
    }

    /*
    //Pamti korisnika, pa aplikacija odmah salje korisnika na main activity, a ne svali put na sign in
    override fun onStart() {
        super.onStart()
        if(firebaseAuth.currentUser != null) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
     */
}