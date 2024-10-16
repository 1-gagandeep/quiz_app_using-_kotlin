package com.example.updatedquizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.updatedquizapp.databinding.ActivityQuestionTypeBinding
import com.google.firebase.auth.FirebaseAuth

class QuestionTypeActivity : AppCompatActivity() {
    private lateinit var logout : AppCompatButton
    private lateinit var binding: ActivityQuestionTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDynamicGk.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("quiz_type", "Dynamic GK")
            startActivity(intent)
        }

        binding.buttonPolity.setOnClickListener {
            val intent = Intent(this, PolityActivity::class.java)
            intent.putExtra("quiz_type", "Polity")
            startActivity(intent)
        }

        binding.buttonHistory.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            intent.putExtra("quiz_type", "History")
            startActivity(intent)
        }

        binding.buttonEconomy.setOnClickListener {
            val intent = Intent(this, EconomyActivity::class.java)
            intent.putExtra("quiz_type", "Economy")
            startActivity(intent)
        }

        binding.buttonLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("logouta", "Log Out")
            startActivity(intent)
        }
    }
}
