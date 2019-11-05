package com.imastudio.firstkotlinapp.activity

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.helper.DataList.dataBuah.WB
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        var intent = intent.getStringExtra(WB)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        if (intent != null) webView.loadUrl(intent)
        else webView.loadUrl("https://quran-offline.netlify.com/")
    }
}
