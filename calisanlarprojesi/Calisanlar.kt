package com.yerinde.calisanlarprojesi

import kotlin.properties.Delegates

class Calisanlar(val isim: String,var yas: Int,var departman: String, private val maas: Int) {

    //private val _maas = maas

    fun maasGoster(): Int {
        println("calisan: ${isim} maas: ${maas}")
        return maas
    }


}