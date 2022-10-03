package com.tm00nlight.chi_homework_2_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var intent: Intent

        findViewById<Button>(R.id.buttonLinearWithText).setOnClickListener {
            intent = Intent(this, LinearWithTextActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonRelativeWithCheckbox).setOnClickListener {
            intent = Intent(this, RelativeWithCheckboxActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonConstraintWithSwitcher).setOnClickListener {
            intent = Intent(this, ConstraintWithSwitcherActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonConstraintWithRadioButton).setOnClickListener {
            intent = Intent(this, ConstraintWithRadioButtonActivity::class.java)
            startActivity(intent)
        }
    }
}