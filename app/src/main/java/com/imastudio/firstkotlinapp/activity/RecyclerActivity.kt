package com.imastudio.firstkotlinapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.adapter.RecyclerBuahAdapter
import com.imastudio.firstkotlinapp.helper.DataList
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        var namaBuah = DataList.nama_buah
        var gambarBuah = DataList.gambar_buah
        var deskSingkatBuah = DataList.desk_singkat_buah
        var deskFullBuah = DataList.desk_full_buah
        var suaraBuah = DataList.suara_buah
        var webBuah = DataList.web_buah

        var adapter = RecyclerBuahAdapter(this,namaBuah,gambarBuah,deskFullBuah,suaraBuah,webBuah)
        recyclerView.adapter=adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }


}
