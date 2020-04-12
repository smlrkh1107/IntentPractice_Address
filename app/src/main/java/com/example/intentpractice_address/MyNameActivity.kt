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
            val inputBirth = editMyAge.text.toString().toInt()

            val myIntent = Intent(this, MyPageActivity::class.java)
                myIntent.putExtra("username", inputName)
                myIntent.putExtra("userage", 2020-inputBirth +1)
            startActivity(myIntent)
        }


    }
}
