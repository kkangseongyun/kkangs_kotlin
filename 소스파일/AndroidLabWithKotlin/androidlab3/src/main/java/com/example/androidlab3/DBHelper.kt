package com.example.androidlab3

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class DBHelper(context: Context) : SQLiteOpenHelper(context, "memodb", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        val memoSQL = "create table tb_memo " +
                "(_id integer primary key autoincrement," +
                "title," +
                "content)"
        db.execSQL(memoSQL)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("drop table tb_memo")
        onCreate(db)
    }
}