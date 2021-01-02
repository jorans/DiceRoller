package se.bdd.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val dice1 = Dice()
    lateinit var dice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice = findViewById(R.id.dice)
        val btn1: Button = findViewById(R.id.button1)
        btn1.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        // get the center for the clipping circle
        val cx = dice.width / 2
        val cy = dice.height / 2

        // get the final radius for the clipping circle
        val finalRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()

        // create the animator for this view (the start radius is zero)
        val anim = ViewAnimationUtils.createCircularReveal(dice, cx, cy, 0f, finalRadius)
        // make the view visible and start the animation
        dice.visibility = View.VISIBLE
        dice.text = dice1.roll().toString()
        anim.setDuration(200)
            .start()
    }


}