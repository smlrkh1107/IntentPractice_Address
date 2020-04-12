package com.example.intentpractice_address

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_name.*

class MyNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_name)

        nameBtn.setOnClickListener{
            val inputName = editMyName.text.toString()
            val myIntent = Intent(this, MyPageActivity::class.java)
                myIntent.putExtra("username", inputName + " 님 안녕하세요.")

            startActivity(myIntent)
        }


    }
}
