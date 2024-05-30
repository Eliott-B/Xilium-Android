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
            if (hasFocus && objetEditText.text.toString() == getString(R.string.objet_ex)) {
                objetEditText.text.clear()
            }
        }

        val categoryEditText = findViewById<EditText>(R.id.editTextCategory)

        categoryEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && categoryEditText.text.toString() == getString(R.string.category_ex)) {
                categoryEditText.text.clear()
            }
        }

        val problemeEditText = findViewById<EditText>(R.id.editTextProbleme)

        problemeEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && problemeEditText.text.toString() == getString(R.string.probleme_ex)) {
                problemeEditText.text.clear()
            }
        }

        val niveauUrgenceEditText = findViewById<EditText>(R.id.editTextNiveauUrgence)

        niveauUrgenceEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && niveauUrgenceEditText.text.toString() == getString(R.string.niveau_urgence_ex)) {
                niveauUrgenceEditText.text.clear()
            }
        }

        val descriptionEditText = findViewById<EditText>(R.id.editTextDescription)

        descriptionEditText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus && descriptionEditText.text.toString() == getString(R.string.description_ex)) {
                descriptionEditText.text.clear()
            }
        }

        val homeButton = findViewById<Button>(R.id.creer)

        homeButton.setOnClickListener { v ->
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