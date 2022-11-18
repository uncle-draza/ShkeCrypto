package com.example.pma_projekat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView
import android.widget.Toast
import com.example.pma_projekat.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity()
{
    private lateinit var binding:ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        //Uklanjanje title bar-a
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        //Firebase Sign Up
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()
        binding.button.setOnClickListener{
            val email = binding.emailET.text.toString()
            val pass = binding.pswdET.text.toString()
            val confpass = binding.confpswdET.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && confpass.isNotEmpty()) {
                if(pass == confpass) {
                    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener{
                        if(it.isSuccessful) {
                            val intent = Intent(this, SignInActivity::class.java)
                            startActivity(intent)
                        }
                        else {
                            Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                else {
                    Toast.makeText(this,"Passwords do not match!", Toast.LENGTH_SHORT).show()
                }
            }
            else {
                Toast.makeText(this,"Fields cannot be empty!", Toast.LENGTH_SHORT).show()
            }
        }

        //Already have an account?
        val switchToSignInBtn = findViewById<TextView>(R.id.textView3)
        switchToSignInBtn.setOnClickListener{
            val i = Intent(this, SignInActivity::class.java)
            startActivity(i)
        }
    }
}