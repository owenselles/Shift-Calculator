package com.owenselles.vul_uren

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalTime
import java.util.concurrent.TimeUnit
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.hours

class MainActivity : AppCompatActivity() {

    @ExperimentalTime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            var normal = normal.text.toString()
            var action = action.text.toString()
            if (action.isEmpty()) {
                action = "0"
            } else if (normal.isEmpty()) {
                normal = "0"
            }
            val normalTime = normal.toDouble() / normalCalculation.text.toString().toInt() * 60
            val actionTime = action.toDouble() / actionCalculation.text.toString().toInt() * 60

            val totalTime = normalTime + actionTime
            val totalHours = totalTime / 60
            total.text = "Totale minuten: ".plus(totalTime.toString())
            hours.text = "Totale uren: ".plus(totalHours.toString())
        }
    }
}
