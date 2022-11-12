package com.example.abstractpainting

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()


    }




    private fun setListeners()
    {

        val boxOne=findViewById<TextView>(R.id.box_one)
        val boxTwe=findViewById<TextView>(R.id.box_two)
        val boxThree=findViewById<TextView>(R.id.box_three)
        val boxFour=findViewById<TextView>(R.id.box_four)
        val boxFive=findViewById<TextView>(R.id.box_five)
        val redB=findViewById<Button>(R.id.red_b)
        val greenB=findViewById<Button>(R.id.hara_b)
        val yellowB=findViewById<Button>(R.id.yellow_b)
        //val lay=findViewById<Layout>(R.id.cons_lay)
        val clickableViews: List<View> = listOf(boxOne,boxTwe,boxThree,boxFour,boxFive,redB,greenB,yellowB)

        for(item in clickableViews)
        {
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        val boxThree=findViewById<TextView>(R.id.box_three)
        val boxFour=findViewById<TextView>(R.id.box_four)
        val boxFive=findViewById<TextView>(R.id.box_five)

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)


            R.id.red_b -> boxThree.setBackgroundResource(R.color.red)
            R.id.yellow_b -> boxFour.setBackgroundResource(R.color.yellow)
            R.id.hara_b -> boxFive.setBackgroundResource(R.color.green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}