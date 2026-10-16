package com.jarvis.ai

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)

        text.text = """
            
            ◉
            
            J A R V I S
            
            PERSONAL AI ASSISTANT
            
            SYSTEM ONLINE
            
        """.trimIndent()

        text.textSize = 28f
        text.setTextColor(Color.WHITE)
        text.setBackgroundColor(Color.BLACK)
        text.gravity = android.view.Gravity.CENTER

        setContentView(text)
    }
}