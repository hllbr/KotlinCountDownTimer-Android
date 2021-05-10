package com.hllbr.kotlincountdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Geri Sayma Sayacı = Count Down Timer

        //val myTime = CountDownTimer(10000,1000) mistaken
        object :  CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                //her belirtilen interval içinde ne olacak
                //millisUntilFinished bitmeye kalan saniye anlamına geliyor
                textView.text = "LEFT : ${millisUntilFinished/1000}"
            }

            override fun onFinish() {

                //işlem bitince ne olacak
                textView.text = "Left : 0"
            }

        }.start()


    }
}
/*
    içerisinde belirlediğim işlemlerin belirli bir periyotta ne olacağı ve işlem bittiğinde ne olacağını yazacağım bir yapıya sahip oluyorum

    2 parametre isteniyor timer içerisinde zamana ifademi milisaniye cinsinden ifade ediyorum

    1.parametre kaç saniye yapının çalıştılmasını istediğimi soruyor

    2.parametre kaç saniyede bir işlem yaptırılmasını istiyorum 2 saniye aralıklarla yada 1.5 saniye aralıklarla işlemler yaptırabilirim.

    Abstract(soyut bir sınıf)'ın instance oluşturulamaz şeklinde bir sorunla karşılaşıyoruz

    Abstract sınıflardan bu şekilde objeler oluşturamıyoruz Inheritance(Kalıtım özelliğinden) yararlanmamız gerekiyor


 */