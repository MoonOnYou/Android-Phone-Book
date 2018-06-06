package com.example.moononyou.phonebookkotlin.realmKotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.moononyou.phonebookkotlin.R
import io.realm.Realm

class Main2Activity : AppCompatActivity() {
    var realm:Realm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Realm.init(applicationContext)
        realm = Realm.getDefaultInstance()
    }

    override fun onDestroy() {
        super.onDestroy()
        realm?.close()
    }
}
