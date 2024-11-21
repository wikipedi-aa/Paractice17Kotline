package com.example.paractice155kotline

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch = findViewById<Switch>(R.id.switch1)

        var currentTheme = AppCompatDelegate.getDefaultNightMode()

        switch.setOnCheckedChangeListener { _, isChecked ->
            setTheme(isChecked, currentTheme)
        }

        setTheme(switch.isChecked, currentTheme)
    }
}
    private fun setTheme(isWhiteMode: Boolean, currentTheme: Int) {
        if (isWhiteMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }

    }
