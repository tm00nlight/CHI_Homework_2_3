package com.tm00nlight.chi_homework_2_3

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.RadioButton
import android.widget.TextView

class CustomColoredRadioButtons @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {
    private val activeButton: TextView by lazy { findViewById<TextView>(R.id.activeButton) }
    private val blueRadio: RadioButton by lazy { findViewById<RadioButton>(R.id.optionBlue) }
    private val redRadio: RadioButton by lazy { findViewById<RadioButton>(R.id.optionRed) }
    private val greenRadio: RadioButton by lazy { findViewById<RadioButton>(R.id.optionGreen) }
    private val yellowRadio: RadioButton by lazy { findViewById<RadioButton>(R.id.optionYellow) }
    lateinit var callbackToast: CheckingButton

    init {
        View.inflate(context, R.layout.custom_colored_radio_buttons, this)
        val arr = context.obtainStyledAttributes(attrs, R.styleable.CustomColoredRadioButtons)

        try {
            activeButton.text = arr.getString(R.styleable.CustomColoredRadioButtons_ActiveButton_text)
            blueRadio.isChecked = arr.getBoolean(R.styleable.CustomColoredRadioButtons_BlueRadio_on, false)
            redRadio.isChecked = arr.getBoolean(R.styleable.CustomColoredRadioButtons_RedRadio_on, false)
            greenRadio.isChecked = arr.getBoolean(R.styleable.CustomColoredRadioButtons_GreenRadio_on, false)
            yellowRadio.isChecked = arr.getBoolean(R.styleable.CustomColoredRadioButtons_YellowRadio_on, false)
        }
        catch (exception: Exception) {
            exception.printStackTrace()
        }
        finally {
            arr.recycle()
        }

        activeButton.setOnClickListener {
            deactivateAll()
            setActiveTextDefault()
            callbackToast.makeToastAboutButton("DEFAULT")
        }

        blueRadio.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                blueRadio.isChecked = true
                activeButton.text = "BLUE"
                callbackToast.makeToastAboutButton("BLUE")
            }
        }

        redRadio.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                redRadio.isChecked = true
                activeButton.text = "RED"
                callbackToast.makeToastAboutButton("RED")
            }
        }

        greenRadio.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                greenRadio.isChecked = true
                activeButton.text = "GREEN"
                callbackToast.makeToastAboutButton("GREEN")
            }
        }

        yellowRadio.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                deactivateAll()
                yellowRadio.isChecked = true
                activeButton.text = "YELLOW"
                callbackToast.makeToastAboutButton("YELLOW")
            }
        }
    }

    fun setCallback(callback: CheckingButton) {
        callbackToast = callback
    }

    private fun deactivateAll() {
        blueRadio.isChecked = false
        redRadio.isChecked = false
        greenRadio.isChecked = false
        yellowRadio.isChecked = false
        setActiveTextDefault()
    }

    private fun setActiveTextDefault() {activeButton.text = context.getString(R.string.button_text)}

}