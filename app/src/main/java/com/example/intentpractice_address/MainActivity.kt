package com.example.intentpractice_address

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goMyPageBtn.setOnClickListener {

            val myIntent = Intent(this,MyPageActivity::class.java)
            startActivity(myIntent)
        }


    }
}
