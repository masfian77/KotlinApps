package com.imastudio.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.activity.*

class MainActivityManual : AppCompatActivity() {
    //todo 1 deklarasi variable scr global
    var btnlist: Button? = null
    var btnKalkulator: Button? = null
    var btnGridView: Button? = null
    var btnRecyclerView: Button? = null
    var btnWebView: Button? = null
    var btnSpinner: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)
        //todo 2 inisialisasi view
        btnlist = findViewById(R.id.btnlistview)
        btnKalkulator = findViewById(R.id.btnKalkulator)
        btnGridView = findViewById(R.id.btngridview)
        btnRecyclerView = findViewById(R.id.btnrecyclerview)
        btnSpinner = findViewById(R.id.btnspinner)
        btnWebView = findViewById(R.id.btnwebview)

        //todo 3 aksi button ketika click

        btnlist?.setOnClickListener {
        // startActivity untuk pindah halaman
            startActivity(Intent(this@MainActivityManual,ListActivity::class.java))
        }
        btnKalkulator?.setOnClickListener {
            startActivity(Intent(this@MainActivityManual,KalkulatorActivity::class.java))

        }
        btnGridView?.setOnClickListener {
            startActivity(Intent(this@MainActivityManual,GridActivity::class.java))

        }
        btnRecyclerView?.setOnClickListener {
            startActivity(Intent(this@MainActivityManual,RecyclerActivity::class.java))

        }
        btnSpinner?.setOnClickListener {
            startActivity(Intent(this@MainActivityManual,SpinnerActivity::class.java))

        }
        btnWebView?.setOnClickListener {
            startActivity(Intent(this@MainActivityManual,WebViewActivity::class.java))

        }
    }

}
