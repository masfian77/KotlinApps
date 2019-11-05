package com.imastudio.firstkotlinapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.activity.GridActivity
import kotlinx.android.synthetic.main.tampilan_list.view.*

class GridBuahAdapter(
var gridActivity: GridActivity,
var namaBuah: Array<String>,
var gambarBuah: Array<Int>
) :BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var v = LayoutInflater.from(gridActivity)
            .inflate(R.layout.tampilan_grid, null)
        v.imgbuah.setImageResource(gambarBuah[p0])
        v.txtnamabuah.text = namaBuah[p0]
        return v

    }

    override fun getItem(p0: Int): Any = p0.toInt()

    override fun getItemId(p0: Int): Long = p0.toLong()

    //untuk mengget total data yang akan ditampilkan
    override fun getCount(): Int = gambarBuah.size
}