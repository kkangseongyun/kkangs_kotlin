package com.example.androidlab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lab2_3.*
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class Lab2_3Activity : AppCompatActivity(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2_3)

        labelTextView.setOnClickListener(this)
        bellTextView.setOnClickListener(this)
        vibrateCheckView.setOnCheckedChangeListener(this)
        repeatCheckView.setOnCheckedChangeListener(this)

    }
    fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onClick(p0: View?) {
        if(p0==labelTextView){
            showToast("labelTextView click event...")
        }else if(p0==bellTextView){
            showToast("bellTextView click event...")
        }
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        if(p0==vibrateCheckView){
            showToast("vibrateCheckView check event...")
        }else if(p0==repeatCheckView){
            showToast("repeatCheckView check event...")
        }
    }


}
