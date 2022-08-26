package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var team1_points = findViewById<TextView>(R.id.team1_value)
        var team2_points = findViewById<TextView>(R.id.team2_value)

        var t1points = 0
        var t2points = 0


        val team1_button1 = findViewById<Button>(R.id.team1_button1)
        team1_button1.setOnClickListener {
            t1points += 3
            team1_points.text = t1points.toString()
        }

        val team2_button1 = findViewById<Button>(R.id.team2_button1)
        team2_button1.setOnClickListener {
            t2points += 3
            team2_points.text = t2points.toString()
        }

        val team1_button2 = findViewById<Button>(R.id.team1_button2)
        team1_button2.setOnClickListener {
            t1points += 2
            team1_points.text = t1points.toString()
        }

        val team2_button2 = findViewById<Button>(R.id.team2_button2)
        team2_button2.setOnClickListener {
            t2points += 2
            team2_points.text = t2points.toString()
        }

        val team1_button3 = findViewById<Button>(R.id.team1_button3)
        team1_button3.setOnClickListener {
            t1points += 1
            team1_points.text = t1points.toString()
        }

        val team2_button3 = findViewById<Button>(R.id.team2_button3)
        team2_button3.setOnClickListener {
            t2points += 1
            team2_points.text = t2points.toString()
        }

        val reset = findViewById<Button>(R.id.reset_button)
        reset.setOnClickListener {
            t1points = 0
            t2points = 0
            team1_points.text = t1points.toString()
            team2_points.text = t2points.toString()
        }

    }
}