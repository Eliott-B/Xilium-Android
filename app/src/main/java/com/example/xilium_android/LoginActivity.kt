package com.example.xilium_android

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        main()
    }

    fun main() {
        // Reset email and password fields when clicked
        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)

        emailEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && emailEditText.text.toString() == getString(R.string.mail_ex)) {
                emailEditText.text.clear()
            }
        }

        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)

        passwordEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && passwordEditText.text.toString() == getString(R.string.password_ex)) {
                passwordEditText.text.clear()
            }
        }

        val loginButton = findViewById<Button>(R.id.connect_ok)

        loginButton.setOnClickListener { v ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}