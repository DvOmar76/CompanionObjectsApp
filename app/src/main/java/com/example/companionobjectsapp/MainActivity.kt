package com.example.companionobjectsapp

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val text = editTextTextPersonName.text.toString()
            if (text == BackgroundType.day) {
                clMain.setBackgroundResource(R.drawable.day)
            } else if (text == BackgroundType.night) {
                clMain.setBackgroundResource(R.drawable.night)
            }
        }
    }
}


class BackgroundType{
    companion object{
        val day="day"
        val night="night"
    }
}