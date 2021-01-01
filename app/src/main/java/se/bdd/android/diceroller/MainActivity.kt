package se.bdd.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val dice1 = Dice()
    lateinit var dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice = findViewById(R.id.imageView)
        val btn1: Button = findViewById(R.id.button1)
        btn1.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        when(dice1.roll()){
            1 -> dice.setImageResource(R.drawable.dice_1)
            2 -> dice.setImageResource(R.drawable.dice_2)
            3 -> dice.setImageResource(R.drawable.dice_3)
            4 -> dice.setImageResource(R.drawable.dice_4)
            5 -> dice.setImageResource(R.drawable.dice_5)
            6 -> dice.setImageResource(R.drawable.dice_6)
        }

    }


}