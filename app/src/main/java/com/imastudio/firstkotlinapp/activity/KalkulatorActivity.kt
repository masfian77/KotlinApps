package com.imastudio.firstkotlinapp.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.R
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        btnbagi.setOnClickListener(this)
        btnkali.setOnClickListener(this)
        btntambah.setOnClickListener(this)
        btnkurang.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnkali -> preValidate('*')
            R.id.btnbagi -> preValidate('/')
            R.id.btntambah -> preValidate('+')
            R.id.btnkurang -> preValidate('-')
        }
    }

    private fun preValidate(c: Char) {
        if (validateInput()) return prosesCalculate(c)
        else Toast.makeText(this@KalkulatorActivity,"Tidak boleh kosong"
            ,Toast.LENGTH_SHORT).show()
    }

    private fun validateInput(): Boolean = !(edtangka1.text.isEmpty() || edtangka2.text.isEmpty())


    private fun prosesCalculate(c: Char) {
        when(c){
            '*'-> txthasil.text = (edtangka1.text.toString().toDouble()*
                    edtangka2.text.toString().toDouble()).toString()
            '/'-> txthasil.text = (edtangka1.text.toString().toDouble()/
                    edtangka2.text.toString().toDouble()).toString()
            '+'-> txthasil.text = (edtangka1.text.toString().toDouble()+
                    edtangka2.text.toString().toDouble()).toString()
            '-'-> txthasil.text = (edtangka1.text.toString().toDouble()-
                    edtangka2.text.toString().toDouble()).toString()
        }
    }
}
