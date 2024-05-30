package com.example.xilium_android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TicketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ticket)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        main()
    }

    fun main() {
        // Reset email and password fields when clicked
        val objetEditText = findViewById<EditText>(R.id.editTextObjet)

        objetEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && objetEditText.text.toString() == getString(R.string.champ_objet)) {
                objetEditText.text.clear()
            }
        }

        val descriptionEditText = findViewById<EditText>(R.id.editTextDescription)

        descriptionEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && descriptionEditText.text.toString() == getString(R.string.champ_description)) {
                descriptionEditText.text.clear()
            }
        }

        val homeButton = findViewById<Button>(R.id.creer)

        homeButton.setOnClickListener { v ->
            if (objetEditText.text.toString() == "" || descriptionEditText.text.toString() == "") {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnAccueil = findViewById<Button>(R.id.accueil)

        btnAccueil.setOnClickListener { v ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}