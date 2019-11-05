package com.imastudio.firstkotlinapp.activity

import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.helper.DataList
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        var namaBuah = DataList.nama_buah
        var gambarBuah = DataList.gambar_buah
        var suaraBuah = DataList.suara_buah

        var adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, namaBuah)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerbuah.adapter = adapter
        spinnerbuah.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }

                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    txtnamabuah.text = namaBuah[p2]
                    imgbuah.setImageResource(gambarBuah[p2])
                    //menjalankan audio
                    var mp = MediaPlayer()
                    var lokasiFile = Uri.parse("android.resource://$packageName/"+suaraBuah[p2])
                    mp.setAudioStreamType(AudioManager.STREAM_MUSIC)
                    mp.setDataSource(this@SpinnerActivity, lokasiFile)
                    mp.prepare()
                    mp.start()
                }
            }
    }
}
