package com.example.androidlab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lab1_4.*
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class Lab1_4Activity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1_4)

        btnVisibleTrue.setOnClickListener(this)
        btnVisibleFalse.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if(p0==btnVisibleTrue){
            textVisibleTarget?.visibility = View.VISIBLE
        }else if(p0 == btnVisibleFalse){
            textVisibleTarget?.visibility = View.INVISIBLE
        }
    }
}
