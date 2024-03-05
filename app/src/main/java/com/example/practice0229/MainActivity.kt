package com.example.practice0229

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber=SecretNumber()
    lateinit var number:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number=findViewById<EditText>(R.id.number)
    }
    fun check(view:View){
        val n = number.text.toString().toInt()
        println("number: $n")
    }
}