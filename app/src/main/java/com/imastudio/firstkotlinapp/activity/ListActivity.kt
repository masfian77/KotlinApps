package com.imastudio.firstkotlinapp.activity

import android.os.Bundle
import com.imastudio.firstkotlinapp.MainActivity
import com.imastudio.firstkotlinapp.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        btnlistbiasa.setOnClickListener {
            pindahHalaman(ListBiasaActivity::class.java)
        }
        btnlistcustom.setOnClickListener {
            pindahHalaman(ListCustomActivity::class.java)

        }
    }
}
