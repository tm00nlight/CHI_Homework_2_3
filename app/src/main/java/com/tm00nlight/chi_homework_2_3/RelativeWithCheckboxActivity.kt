package com.tm00nlight.chi_homework_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class RelativeWithCheckboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_with_checkbox)

        val activeButton = findViewById<TextView>(R.id.activeButton)
        val blueCheckBox = findViewById<CheckBox>(R.id.optionBlue)
        val redCheckBox = findViewById<CheckBox>(R.id.optionRed)
        val greenCheckBox = findViewById<CheckBox>(R.id.optionGreen)
        val yellowCheckBox = findViewById<CheckBox>(R.id.optionYellow)

        activeButton.setOnClickListener {
            deactivateAll()
        }

        blueCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                blueCheckBox.isChecked = true
                activeButton.text = "BLUE"
            }
            else activeButton.text = getString(R.string.button_text)
        }

        redCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                redCheckBox.isChecked = true
                activeButton.text = "RED"
            }
            else activeButton.text = getString(R.string.button_text)
        }

        greenCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                greenCheckBox.isChecked = true
                activeButton.text = "GREEN"
            }
            else activeButton.text = getString(R.string.button_text)
        }

        yellowCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                yellowCheckBox.isChecked = true
                activeButton.text = "YELLOW"
            }
            else activeButton.text = getString(R.string.button_text)
        }
    }

    private fun deactivateAll() {
        findViewById<CheckBox>(R.id.optionBlue).isChecked = false
        findViewById<CheckBox>(R.id.optionRed).isChecked = false
        findViewById<CheckBox>(R.id.optionGreen).isChecked = false
        findViewById<CheckBox>(R.id.optionYellow).isChecked = false
        findViewById<TextView>(R.id.activeButton).text = getString(R.string.button_text)
    }
}