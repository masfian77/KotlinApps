package com.imastudio.firstkotlinapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.activity.*
import kotlinx.android.synthetic.main.activity_awal.*

 open class MainActivity : AppCompatActivity() {
//deklarasi variable context (global)
   var c: Context?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)
        //inisialiasasi kontext
        c=this@MainActivity
        // aksi button ketika click
        // startActivity untuk pindah halaman
        btnlistview?.setOnClickListener { pindahHalaman(ListActivity::class.java) }
        btnKalkulator?.setOnClickListener { pindahHalaman(KalkulatorActivity::class.java) }
        btngridview?.setOnClickListener { pindahHalaman(GridActivity::class.java) }
        btnrecyclerview?.setOnClickListener { pindahHalaman(RecyclerActivity::class.java) }
        btnspinner?.setOnClickListener { pindahHalaman(SpinnerActivity::class.java) }
        btnwebview?.setOnClickListener { pindahHalaman(WebViewActivity::class.java) }
    }
    //buat function
    fun pindahHalaman(kelasTujuan :Class<*>)= startActivity(Intent(c,kelasTujuan))
}
