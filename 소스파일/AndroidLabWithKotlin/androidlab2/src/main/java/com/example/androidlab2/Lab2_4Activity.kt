package com.example.androidlab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lab2_4.*
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class Lab2_4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2_4)

        labelTextView.setOnClickListener{ showToast("labelTextView click event...") }
        bellTextView.setOnClickListener{ showToast("bellTextView click event...") }
        vibrateCheckView.setOnCheckedChangeListener{ p0, p2  -> showToast("vibrateCheckView check event...") }
        repeatCheckView.setOnCheckedChangeListener{ p0, p1 -> showToast("repeatCheckView check event...") }
    }
    fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

