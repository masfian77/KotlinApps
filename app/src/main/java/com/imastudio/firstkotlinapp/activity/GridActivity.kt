package com.imastudio.firstkotlinapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.DetailListActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.adapter.GridBuahAdapter
import com.imastudio.firstkotlinapp.helper.DataList
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.DFB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.GB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.NB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.SB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.WB
import kotlinx.android.synthetic.main.activity_grid.*
import kotlinx.android.synthetic.main.tampilan_grid.*

class GridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        var namaBuah = DataList.nama_buah
        var gambarBuah = DataList.gambar_buah
        var deskSingkatBuah = DataList.desk_singkat_buah
        var deskFullBuah = DataList.desk_full_buah
        var suaraBuah = DataList.suara_buah
        var webBuah = DataList.web_buah

        val adapter = GridBuahAdapter(this,namaBuah,gambarBuah)
        gridbuah.adapter=adapter
        gridbuah.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(
                this@GridActivity
                , DetailListActivity::class.java
            )
            intent.putExtra(DataList.NB, namaBuah[i])
            intent.putExtra(DataList.GB, gambarBuah[i])
            intent.putExtra(DataList.DFB, deskFullBuah?.get(i))
            intent.putExtra(DataList.SB, suaraBuah[i])
            intent.putExtra(DataList.WB, webBuah[i])
            startActivity(intent)
        }
    }
}
