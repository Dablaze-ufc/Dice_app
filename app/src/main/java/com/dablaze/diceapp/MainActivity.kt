package com.dablaze.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rollButton: MaterialButton
    private lateinit var rollResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollResult = findViewById(R.id.roll_result)
        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNum = Random().nextInt(6) + 1

        val randomPic = when (randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage: ImageView = findViewById(R.id.imageView_roll)
        rollResult.text = randomNum.toString()
        diceImage.setImageResource(randomPic)

    }
}

