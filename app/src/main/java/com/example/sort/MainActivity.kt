package com.example.sort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etInput: EditText
    private lateinit var btnRegister: Button
    private lateinit var btnRandom: Button
    private lateinit var tvResult: TextView
    private lateinit var words: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etInput = findViewById(R.id.etInput)
        this.btnRegister = findViewById(R.id.btnRegister)
        this.btnRandom = findViewById(R.id.btnRandom)
        this.tvResult = findViewById(R.id.tvResult)
        this.words = mutableListOf()

        this.btnRegister.setOnClickListener { add() }
        this.btnRandom.setOnClickListener { draw() }
    }

    private fun add() {
        val word = this.etInput.text.toString()
        this.words.add(word)
        this.etInput.text.clear()
    }

    private fun draw() {
        val word = this.words.random()
        this.tvResult.text = word
    }
}