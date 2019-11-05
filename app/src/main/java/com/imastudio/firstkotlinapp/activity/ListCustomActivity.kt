package com.imastudio.firstkotlinapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.DetailListActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.adapter.ListBuahAdapter
import com.imastudio.firstkotlinapp.helper.DataList
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.DFB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.DSB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.GB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.NB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.SB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.WB
import kotlinx.android.synthetic.main.activity_list_custom.*

class ListCustomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_custom)

        var namaBuah =DataList.nama_buah
        var gambarBuah =DataList.gambar_buah
        var deskSingkatBuah =DataList.desk_singkat_buah
        var deskFullBuah =DataList.desk_full_buah
        var suaraBuah = DataList.suara_buah
        var webBuah = DataList.web_buah

         //call adapter
        var adapter = ListBuahAdapter(this,namaBuah,gambarBuah,deskSingkatBuah)
        //set view to adapter
        listcustom.adapter = adapter
        //aksi klik item di list
        listcustom.setOnItemClickListener { adapterView, view, i, l ->
            var intent= Intent(this@ListCustomActivity, DetailListActivity::class.java)
            intent.putExtra(NB, namaBuah[i])
            intent.putExtra(GB, gambarBuah[i])
            intent.putExtra(DFB, deskFullBuah?.get(i))
            intent.putExtra(SB, suaraBuah[i])
            intent.putExtra(WB, webBuah[i])
            startActivity(intent)
        }
    }
}
