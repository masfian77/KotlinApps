package com.imastudio.firstkotlinapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imastudio.firstkotlinapp.DetailListActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.activity.RecyclerActivity
import com.imastudio.firstkotlinapp.helper.DataList
import kotlinx.android.synthetic.main.tampilan_listrecycler.view.*

class RecyclerBuahAdapter(
    var recyclerActivity: RecyclerActivity,
    var namaBuah: Array<String>,
    var gambarBuah: Array<Int>,
    var deskFullBuah: Array<String>?,
    var suaraBuah: Array<Int>,
    var webBuah: Array<String>
) : RecyclerView.Adapter<RecyclerBuahAdapter.MyViewHolder>() {

    //sama sprti getview di baseAdapter,fungsinya untuk menset layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            LayoutInflater.from(recyclerActivity)
                .inflate(R.layout.tampilan_listrecycler, parent, false)
        )

    //deklarasi dan inisialisasi
    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v)

    override fun getItemCount(): Int = namaBuah.size

    //setdata
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.itemView) {
            txtnamabuah.text = namaBuah[position]
            imgbuah.setImageResource(gambarBuah[position])
            setOnClickListener {
                var intent = Intent(
                    recyclerActivity
                    , DetailListActivity::class.java
                )
                intent.putExtra(DataList.NB, namaBuah[position])
                intent.putExtra(DataList.GB, gambarBuah[position])
                intent.putExtra(DataList.DFB, deskFullBuah?.get(position))
                intent.putExtra(DataList.SB, suaraBuah[position])
                intent.putExtra(DataList.WB, webBuah[position])
                recyclerActivity.startActivity(intent)
            }
        }

    }


}