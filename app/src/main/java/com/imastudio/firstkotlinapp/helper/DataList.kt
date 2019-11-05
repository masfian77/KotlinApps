package com.imastudio.firstkotlinapp.helper

import com.imastudio.firstkotlinapp.App
import com.imastudio.firstkotlinapp.App.Companion.context
import com.imastudio.firstkotlinapp.R

class DataList {
    companion object dataBuah {
        var nama_buah = arrayOf(
            "alpukat", "jambu air", "manggis"
            , "strawberry", "ceri", "durian", "apel"
        )
        var gambar_buah = arrayOf(
            R.drawable.alpukat, R.drawable.jambuair, R.drawable.manggis
            , R.drawable.strawberry, R.drawable.ceri, R.drawable.durian, R.drawable.apel
        )
        var desk_singkat_buah = arrayOf(
            "alpukat adalah buah buahan enak",
            "jambu air adalah buah buahan enak",
            "manggis adalah buah buahan enak",
            "strawberry adalah buah buahan enak",
            "ceri adalah buah buahan enak",
            "durian adalah buah buahan enak",
            "apel adalah buah buahan enak"
        )
        var web_buah = arrayOf(
            "https://id.wikipedia.org/wiki/Avokad",
            "https://id.wikipedia.org/wiki/Jambu_air",
            "https://id.wikipedia.org/wiki/Manggis",
            "https://id.wikipedia.org/wiki/Stroberi_kebun",
            "https://id.wikipedia.org/wiki/Ceri",
            "https://id.wikipedia.org/wiki/Durian",
            "https://id.wikipedia.org/wiki/Apel"
        )
        var suara_buah = arrayOf(
            R.raw.alpukat, R.raw.jambuair, R.raw.manggis,
            R.raw.strawberry, R.raw.ceri, R.raw.durian, R.raw.apel
        )
        var contex = App.context
        var desk_full_buah = context?.resources?.getStringArray(R.array.detailbuah)

        const val NB = "nb"
        const val GB = "gb"
        const val SB = "sb"
        const val DFB = "dfb"
        const val DSB = "dsb"
        const val WB = "wb"

    }
}