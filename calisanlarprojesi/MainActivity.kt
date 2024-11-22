package com.yerinde.calisanlarprojesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //calisanlar listesi olusturuldu, Calisanlar elemanli
        val calisanlarListesi = arrayListOf<Calisanlar>()

        //calisanlar olusturuldu.
        val calisan1 = Calisanlar("Ahmet", 20, "yazilim", 20000)
        val calisan2 = Calisanlar("Mehmet", 27, "finans", 35000)
        val calisan3 = Calisanlar("Veli", 23, "satis", 35000)
        val calisan4 = Calisanlar("Musa", 21, "finans", 27500)
        val calisan5 = Calisanlar("Veysel", 35, "satis", 70000)
        val calisan6 = Calisanlar("Furkan", 26, "yazilim", 47500)
        val calisan7 = Calisanlar("Kerem", 40, "finans", 17000)
        val calisan8 = Calisanlar("Tunahan", 18, "satis", 28000)
        val calisan9 = Calisanlar("Samet", 39, "yazilim", 17000)
        val calisan10 = Calisanlar("Kemal", 45, "satis", 30000)

        //objeler listeye eklendi
        calisanlarListesi.add(calisan1)
        calisanlarListesi.add(calisan2)
        calisanlarListesi.add(calisan3)
        calisanlarListesi.add(calisan4)
        calisanlarListesi.add(calisan5)
        calisanlarListesi.add(calisan6)
        calisanlarListesi.add(calisan7)
        calisanlarListesi.add(calisan8)
        calisanlarListesi.add(calisan9)
        calisanlarListesi.add(calisan10)

        //yasi 30'dan buyuk ve departman'i yazilim olan calisanlarin maaslari newList'e eklendi.
        val newList = calisanlarListesi.filter{it -> it.yas > 30}.filter { it -> it.departman == "yazilim" }.map { it -> it.maasGoster() }
        println(newList)

        //yasi 25'den kucuk calisanlarin isimleri newList2'ye eklendi.
        val newList2 = calisanlarListesi.filter { it -> it.yas < 25 }.map { it -> it.isim }
        println(newList2)
    }
}