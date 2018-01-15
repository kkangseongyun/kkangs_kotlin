package com.example.androidlab3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_read_db.*
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class ReadDBActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_db)

        val helper = DBHelper(this)
        val db = helper.writableDatabase
        val cursor= db.rawQuery("select title, content from tb_memo order by _id desc limit 1", null);
        while (cursor.moveToNext()){
            readTitleView.setText(cursor.getString(0));
            readContentView.setText(cursor.getString(1));
        }
        db.close();
    }
}
