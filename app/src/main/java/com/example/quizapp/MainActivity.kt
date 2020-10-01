package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var take_quiz_button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        take_quiz_button = findViewById(R.id.take_quiz)
        take_quiz_button?.setOnClickListener {
            val quizIntent = Intent(this, QuizActivity::class.java)
            quizIntent.putExtra("EdiTtEXTvALUE", "Welcome " + name_field.text)
            startActivity(quizIntent)
        }
    }


    
}
