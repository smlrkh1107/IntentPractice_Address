package com.example.intentpractice_address

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_address.*

class MyAddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_address)


        myAddressBtn.setOnClickListener{
            val resultIntent = Intent(this, MyNameActivity::class.java)
                resultIntent.putExtra("mainaddress", mainAddressEdt.text.toString())
                resultIntent.putExtra("detailaddress", detailAddressEdt.text.toString())

            setResult(Activity.RESULT_OK, resultIntent)
            //입력완료를 눌렀다고 명시, + 들고갈 데이터는 resultIntent에있다.

            finish() //화면종료
        }



    }
}
