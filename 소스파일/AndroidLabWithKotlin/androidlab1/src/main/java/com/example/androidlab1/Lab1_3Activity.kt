package com.example.androidlab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class Lab1_3Activity : AppCompatActivity(), View.OnClickListener {

    var trueBtn: Button? = null
    var targetTextView: TextView? = null
    var falseBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1_3)

        trueBtn = findViewById(R.id.btn_visible_true)
        targetTextView = findViewById(R.id.text_visible_target)
        falseBtn = findViewById(R.id.btn_visible_false)

        trueBtn?.setOnClickListener(this)
        falseBtn?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if(p0==trueBtn){
            targetTextView?.visibility = View.VISIBLE
        }else if(p0 == falseBtn){
            targetTextView?.visibility = View.INVISIBLE
        }
    }
}
