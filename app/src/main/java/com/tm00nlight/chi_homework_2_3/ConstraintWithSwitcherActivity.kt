package com.tm00nlight.chi_homework_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView

class ConstraintWithSwitcherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_with_switcher)

        val activeButton = findViewById<TextView>(R.id.activeButton)
        val blueSwitcher = findViewById<Switch>(R.id.optionBlue)
        val redSwitcher = findViewById<Switch>(R.id.optionRed)
        val greenSwitcher = findViewById<Switch>(R.id.optionGreen)
        val yellowSwitcher = findViewById<Switch>(R.id.optionYellow)

        activeButton.setOnClickListener {
            deactivateAll()
        }

        blueSwitcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                blueSwitcher.isChecked = true
                activeButton.text = "BLUE"
            }
            else activeButton.text = getString(R.string.button_text)
        }

        redSwitcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                redSwitcher.isChecked = true
                activeButton.text = "RED"
            }
            else activeButton.text = getString(R.string.button_text)
        }

        greenSwitcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                greenSwitcher.isChecked = true
                activeButton.text = "GREEN"
            }
            else activeButton.text = getString(R.string.button_text)
        }

        yellowSwitcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                yellowSwitcher.isChecked = true
                activeButton.text = "YELLOW"
            }
            else activeButton.text = getString(R.string.button_text)
        }

    }

    private fun deactivateAll() {
        findViewById<Switch>(R.id.optionBlue).isChecked = false
        findViewById<Switch>(R.id.optionRed).isChecked = false
        findViewById<Switch>(R.id.optionGreen).isChecked = false
        findViewById<Switch>(R.id.optionYellow).isChecked = false
        findViewById<TextView>(R.id.activeButton).text = getString(R.string.button_text)
    }
}