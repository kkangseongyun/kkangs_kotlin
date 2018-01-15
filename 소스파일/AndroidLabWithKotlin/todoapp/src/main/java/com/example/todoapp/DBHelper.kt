package com.example.todoapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class DBHelper(context: Context) : SQLiteOpenHelper(context, "tododb", null, 2) {
    override fun onCreate(db: SQLiteDatabase) {
        val memoSQL = "create table tb_todo " +
                "(_id integer primary key autoincrement," +
                "title," +
                "content," +
                "date," +
                "completed)"//0 - none, 1 - completed
        db.execSQL(memoSQL)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("drop table tb_todo")
        onCreate(db)
    }
}