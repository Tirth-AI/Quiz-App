package com.tirth.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.contentcapture.ContentCaptureSession
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView =  findViewById(R.id.tvResultName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnHome: Button = findViewById(R.id.btnHome)
        val tvCongratulations: TextView = findViewById(R.id.tvCongratulations)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 7)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)

        if(correctAnswers < 3)
        {
            tvCongratulations.text = "You need to work harder!"
        }else if(correctAnswers > 3 && correctAnswers < 6)
        {
            tvCongratulations.text = "You could have done better!"
        }
        tvName.text = userName
        tvScore.text = "Scored $correctAnswers out of $totalQuestions"

        btnHome.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}