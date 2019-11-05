package com.imastudio.firstkotlinapp.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.helper.DataList
import kotlinx.android.synthetic.main.activity_list_biasa.*

class ListBiasaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_biasa)
        //adapter = untuk menghubungi antara data dan view
        var  adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, DataList.nama_buah)
        //set view to adapter
        listbiasa.adapter = adapter
    }
}
