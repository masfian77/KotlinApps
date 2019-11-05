package com.imastudio.firstkotlinapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.activity.ListCustomActivity
import kotlinx.android.synthetic.main.tampilan_list.view.*

class ListBuahAdapter(
    var  listCustomActivity: ListCustomActivity,
    var  namaBuah: Array<String>,
    var  gambarBuah: Array<Int>,
    var  deskSingkatBuah: Array<String>
) : BaseAdapter() {
    //untuk set | configure layout
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //layoutinflater untuk menjadikan suatu view menjadi tampilan popup
        var v = LayoutInflater.from(listCustomActivity).inflate(R.layout.tampilan_list, null)
        v.imgbuah.setImageResource(gambarBuah[p0])
        v.txtdeskbuah.text= deskSingkatBuah[p0]
        v.txtnamabuah.text = namaBuah[p0]
        return v
    }

    override fun getItem(p0: Int): Any = p0.toInt()

    override fun getItemId(p0: Int): Long = p0.toLong()

    //untuk mengget total data yang akan ditampilkan
    override fun getCount(): Int = gambarBuah.size

}