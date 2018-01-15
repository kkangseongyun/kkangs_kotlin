package com.example.androidlab3

import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_lab3_2.*
import kotlinx.android.synthetic.main.item_main.view.*
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class Lab3_2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab3_2)

        val list = mutableListOf<String>()
        for (i in 0..19) {
            list.add("Item=" + i)
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(list)
        recyclerView.addItemDecoration(MyItemDecoration())
    }

    private class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTextView=itemView.itemTextView
    }

    private class MyAdapter(private val list: MutableList<String>) : RecyclerView.Adapter<MyViewHolder>() {

        override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyViewHolder {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_main, viewGroup, false)
            return MyViewHolder(view)
        }

        override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
            val text = list.get(position)
            viewHolder.itemTextView.text= text
        }

        override fun getItemCount(): Int {
            return list.size
        }
    }

    class MyItemDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                           state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            //항목의 index 값 획득
            val index = parent.getChildAdapterPosition(view) + 1
            if (index % 3 == 0)
            //left, top, right, bottom
                outRect.set(20, 20, 20, 60)
            else
                outRect.set(20, 20, 20, 20)
            view.setBackgroundColor(0xFFECE9E9.toInt());
            ViewCompat.setElevation(view, 20.0f)
        }
    }
}


