package se.bdd.android.diceroller

class Dice(val numSides: Int = 6) {

    fun roll(): Int = (1..numSides).random()
}