package com.example.FindFun

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homepage.*


class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        buttonToDoList.setOnClickListener{
            val intent=Intent(this,DashboardActivity::class.java)
            startActivity(intent)
        }

        buttonUserProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)

            //start the second activity. With no return value
            startActivity(intent)
        }
        buttonTimeActivity.setOnClickListener {
            val intent = Intent(this, TimerActivity::class.java)

            //start the second activity. With no return value
            startActivity(intent)
        }

        buttonScheduleReminder.setOnClickListener {
            val intent = Intent(this, Schedule::class.java)

            //start the second activity. With no return value
            startActivity(intent)
        }

    }





}