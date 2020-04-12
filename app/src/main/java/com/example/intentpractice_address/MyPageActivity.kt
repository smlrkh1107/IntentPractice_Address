package com.example.intentpractice_address

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val  name = intent.getStringExtra("username")
        userNameTxt.text = "${name}님 안녕하세요!"
        val age = intent.getIntExtra("userage", -1)
        // getInt는 Default값을 무조건 정해줘야함
        userAgeTxt.text = "${name}(${age})님의 또래가 좋아하는 추천목록을 준비했어요!"
    }
}
