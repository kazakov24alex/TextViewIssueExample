package com.kazakov24alex.textviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text2 = findViewById<TextView>(R.id.text2)
        text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
    }
}
