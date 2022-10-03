package com.tm00nlight.chi_homework_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConstraintWithRadioButtonActivity : AppCompatActivity(), CheckingButton {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_with_radio_button)

        findViewById<CustomColoredRadioButtons>(R.id.customView).setCallback(this)
    }

    override fun makeToastAboutButton(text: String) {
        Toast.makeText(this, "$text Button was Clicked!", Toast.LENGTH_SHORT).show()
    }
}