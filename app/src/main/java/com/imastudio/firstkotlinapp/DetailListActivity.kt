package com.imastudio.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.imastudio.firstkotlinapp.activity.WebViewActivity
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.DFB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.GB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.NB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.SB
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.WB
import kotlinx.android.synthetic.main.activity_detail_list.*

class DetailListActivity : AppCompatActivity() {
    var webBuah : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_list)

        var tangkapData = intent
        //menangkap data dari intent sebelumnya
        var namaBuah = tangkapData.getStringExtra(NB)
        var gambarBuah = tangkapData.getIntExtra(GB, 0)
        var suaraBuah = tangkapData.getIntExtra(SB, 0)
        var detailFullBuah = tangkapData.getStringExtra(DFB)
        webBuah = tangkapData.getStringExtra(WB)

        //mengganti tulisan toolbar
        var titlebar = supportActionBar
        titlebar?.title = namaBuah

        //set data to view
        imgdetailbuah.setImageResource(gambarBuah)
        txtdetailnamabuah.text = namaBuah
        txtdetailbuah.text = detailFullBuah

        //menjalankan audio
        var mp = MediaPlayer()
        var lokasiFile = Uri.parse("android.resource://$packageName/"+suaraBuah)
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC)
        mp.setDataSource(this, lokasiFile)
        mp.prepare()
        mp.start()

    }
    //untuk menampilkan menu di suatu activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        if (id==R.id.mn_web) {
            var intent = Intent(this@DetailListActivity, WebViewActivity::class.java)
            intent.putExtra(WB, webBuah)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

}
