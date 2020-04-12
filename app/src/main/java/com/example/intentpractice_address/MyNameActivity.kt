package com.example.intentpractice_address

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_name.*

class MyNameActivity : AppCompatActivity() {

    val REQ_FOR_ADDRESS = 1000
    //숫자로 받아야해서 이건 버튼눌렀다는걸 확인하기위한 변수

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_name)


        findAddressBtn.setOnClickListener{
            val myIntent = Intent(this, MyAddressActivity::class.java)
                startActivityForResult(myIntent, REQ_FOR_ADDRESS)
            //주소찾기 버튼누르면 1000이라는 결과값을 받는다! >일단 페이지는 이동
        }


        nameBtn.setOnClickListener{
            val inputName = editMyName.text.toString()
            val inputBirth = editMyAge.text.toString().toInt()

            val myIntent = Intent(this, MyPageActivity::class.java)
                myIntent.putExtra("username", inputName)
                myIntent.putExtra("userage", 2020-inputBirth +1)
            startActivity(myIntent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //요청종류 확인
        if (requestCode == REQ_FOR_ADDRESS) {
            //확인눌러서 종료된거 맞니?
            if (requestCode == Activity.RESULT_OK){
                //첨부된 데이터 받기
                val main = data?.getStringExtra("mainaddress")
                val detail = data?.getStringExtra("detailaddress")

                getAddress.text = "${main} / ${detail}"
            }
        }
    }
}
