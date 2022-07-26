package com.example.contrainlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener(){
        val boxOneText = findViewById<TextView>(R.id.boxOne)
        val boxTwoText = findViewById<TextView>(R.id.boxTwo)
        val boxThreeText = findViewById<TextView>(R.id.boxThree)
        val boxFourText = findViewById<TextView>(R.id.boxFour)
        val boxFiveText = findViewById<TextView>(R.id.boxFive)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText
            )

        for(item in clickableViews){
            item.setOnClickListener{ makeColoured(it) }
        }
    }

    private fun makeColoured(view: View){
        when(view.id){
            R.id.boxOne -> view.setBackgroundColor(Color.GREEN)
            R.id.boxTwo -> view.setBackgroundColor(Color.RED)
            R.id.boxThree -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFour -> view.setBackgroundColor(Color.YELLOW)
            R.id.boxFive -> view.setBackgroundColor(Color.CYAN)
            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}