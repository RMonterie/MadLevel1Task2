package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var correctAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            checkAnswers()
            Toast.makeText(this, "Amount of correct answers: $correctAnswers", Toast.LENGTH_LONG).show()
            correctAnswers = 0
        }
    }

    /**
     * Checks if answers 1 through 4 are correct.
     */
    private fun checkAnswers(){
        checkAnswerOne()
        checkAnswerTwo()
        checkAnswerThree()
        checkAnswerFour()
        }


    private fun checkAnswerOne(){
        val answer1 = binding.etAnswerOne.text.toString().toUpperCase()
        if(answer1 == "T"){
            correctAnswers++
        }
    }
    private fun checkAnswerTwo(){
        val answer2 = binding.etAnswerTwo.text.toString().toUpperCase()
        if(answer2 == "F"){
            correctAnswers++
        }
    }
    private fun checkAnswerThree(){
        val answer3 = binding.etAnswerThree.text.toString().toUpperCase()
        if(answer3 == "F"){
            correctAnswers++
        }
    }
    private fun checkAnswerFour(){
        val answer4 = binding.etAnswerFour.text.toString().toUpperCase()
        if(answer4 == "F"){
            correctAnswers++
        }
    }
    }
