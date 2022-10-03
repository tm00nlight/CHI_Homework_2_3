package com.tm00nlight.chi_homework_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LinearWithTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_with_text)

        findViewById<TextView>(R.id.optionRed).setOnClickListener { setActive("RED") }
        findViewById<TextView>(R.id.optionBlue).setOnClickListener { setActive("BLUE") }
        findViewById<TextView>(R.id.optionGreen).setOnClickListener { setActive("GREEN") }
        findViewById<TextView>(R.id.optionYellow).setOnClickListener { setActive("YELLOW") }

        findViewById<TextView>(R.id.activeButton).setOnClickListener {
            setActive(getString(R.string.button_text))
        }
    }

    fun setActive(text: String) {
        findViewById<TextView>(R.id.activeButton).text = text
    }
}