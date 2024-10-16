package com.example.updatedquizapp

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.example.updatedquizapp.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.score.setText("Congrats !!! your score is ${intent.getIntExtra("SCORE", 0)}")
    }
}
