package com.makino.harutiro.work20210424count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 0

        findViewById<Button>(R.id.pButton).setOnClickListener{

            num++

            findViewById<TextView>(R.id.textView).text = num.toString()

        }


    }
}