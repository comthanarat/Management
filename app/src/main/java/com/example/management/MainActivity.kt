package com.example.management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.contact.view.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit_view_animation()
        add_contact()
        cancel_edit()

    }
    fun edit_view_animation() {
        var editbut = findViewById<Button>(R.id.edit_but)
        var block:ImageView = findViewById(R.id.block1)
        var adbut = findViewById<Button>(R.id.add)
        var cancel:TextView= findViewById(R.id.Cancel)
        var done:TextView = findViewById(R.id.Done)
        editbut.setOnClickListener {
            val fade = AnimationUtils.loadAnimation(this, R.anim.fade)
            editbut.startAnimation(fade)
            val sd = AnimationUtils.loadAnimation(this,R.anim.slide_down)
            block.startAnimation(sd)
            val sd_add = AnimationUtils.loadAnimation(this,R.anim.fade_in)
            editbut.visibility = View.GONE
            block.translationY = 80F
            adbut.startAnimation(sd_add)
            cancel.startAnimation(sd_add)
            done.startAnimation(sd_add)
            cancel.visibility=View.VISIBLE
            done.visibility=View.VISIBLE
            adbut.visibility=View.VISIBLE

        }
    }

   private fun add_contact()
   {
       var adbut = findViewById<Button>(R.id.add)
       adbut.setOnClickListener {
           val intent = Intent(this,contact::class.java)
           startActivity(intent)
       }
   }

    private fun cancel_edit()
    {
            var editbut = findViewById<Button>(R.id.edit_but)
            var block:ImageView = findViewById(R.id.block1)
            var adbut = findViewById<Button>(R.id.add)
            var cancel:TextView= findViewById(R.id.Cancel)
            var done:TextView = findViewById(R.id.Done)
            cancel.setOnClickListener {
                val fade = AnimationUtils.loadAnimation(this, R.anim.fade_in)
                editbut.startAnimation(fade)
                val sd = AnimationUtils.loadAnimation(this, R.anim.slide_up)
                block.startAnimation(sd)
                val sd_add = AnimationUtils.loadAnimation(this, R.anim.fade)
                editbut.visibility = View.VISIBLE
                block.translationY = 0F
                adbut.startAnimation(sd_add)
                cancel.startAnimation(sd_add)
                done.startAnimation(sd_add)
                cancel.visibility = View.INVISIBLE
                done.visibility = View.INVISIBLE
                adbut.visibility = View.INVISIBLE
            }
    }

    private fun done_edit()
    {
        var editbut = findViewById<Button>(R.id.edit_but)
        var block:ImageView = findViewById(R.id.block1)
        var adbut = findViewById<Button>(R.id.add)
        var cancel:TextView= findViewById(R.id.Cancel)
        var done:TextView = findViewById(R.id.Done)
        cancel.setOnClickListener {
            val fade = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            editbut.startAnimation(fade)
            val sd = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            block.startAnimation(sd)
            val sd_add = AnimationUtils.loadAnimation(this, R.anim.fade)
            editbut.visibility = View.VISIBLE
            block.translationY = 0F
            adbut.startAnimation(sd_add)
            cancel.startAnimation(sd_add)
            done.startAnimation(sd_add)
            cancel.visibility = View.INVISIBLE
            done.visibility = View.INVISIBLE
            adbut.visibility = View.INVISIBLE
        }
    }



}
