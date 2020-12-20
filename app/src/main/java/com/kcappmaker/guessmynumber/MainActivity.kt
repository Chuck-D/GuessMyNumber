package com.kcappmaker.guessmynumber

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number : Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        answer_text_view
        question_text_view.text = String.format(resources.getString(R.string.str_question),number)
    }

    fun clickUpwardArrow(view: View){
        when (number) {
            3 -> {guessTheNumber(4)}
            5 -> {guessTheNumber(8)}
            8 -> {guessTheNumber(9)}
            else -> {guessTheNumber(10)}
        }
    }

    fun clickSuccess(view: View){
        question_text_view.visibility = View.INVISIBLE
        answer_text_view.visibility = View.VISIBLE
        answer_text_view.text = String.format(resources.getString(R.string.str_success),number)
    }

    fun clickDownwardArrow(view: View){
        when (number) {
            2 -> {guessTheNumber(1)}
            3 -> {guessTheNumber(2)}
            5 -> {guessTheNumber(3)}
            7 -> {guessTheNumber(6)}
            else -> {guessTheNumber(7)}
        }
    }

    fun clickResetButton(view: View){
        question_text_view.visibility = View.VISIBLE
        answer_text_view.visibility = View.INVISIBLE
        guessTheNumber(5)
    }

    private fun printTheQuestion(){
        question_text_view.text = String.format(resources.getString(R.string.str_question), number)
    }

    private fun guessTheNumber(myNumber : Int){
        number = myNumber
        printTheQuestion()

    }
}