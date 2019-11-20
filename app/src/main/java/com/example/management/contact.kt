package com.example.management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_contact.*

class contact : AppCompatActivity() {

    lateinit var usersDBHelper : UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        cancel_input()
        done_input()
        //add_contact()
    }
    //fix this ballock function
    private fun cancel_input(){
        var cancel: TextView = findViewById(R.id.cancel_in)
        var confirm:ImageView = findViewById(R.id.confirm_box)
        var discard:Button = findViewById(R.id.discard_in)
        var save:Button = findViewById(R.id.save_in)
        cancel.setOnClickListener {
            confirm.visibility=View.VISIBLE
            discard.visibility=View.VISIBLE
            save.visibility=View.VISIBLE
            var intent_in = Intent(this,MainActivity::class.java)
                discard.setOnClickListener {
                    startActivity(intent_in)
                }
                save.setOnClickListener {
                    confirm.visibility=View.GONE
                    discard.visibility=View.GONE
                    save.visibility=View.GONE
                }



        }
    }

    private fun done_input(){
        var done: Button = findViewById(R.id.done_pop)
        done.setOnClickListener {
            var intent1_in = Intent(this,MainActivity::class.java)
            startActivity(intent1_in)
        }
    }


    /*fun add_contact(){
        var name = this.name.text.toString()
        var phone = this.phone.text.toString()
        var relation = this.relate.text.toString()
        var result = usersDBHelper.insertUser(UserModel(1,relate_name = name,phone_no = phone,relation = relation))
        Toast.makeText(applicationContext,"Added user : "+result,Toast.LENGTH_LONG)
    }*/

}

