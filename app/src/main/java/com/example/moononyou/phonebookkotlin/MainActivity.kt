package com.example.moononyou.phonebookkotlin

import android.Manifest
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        permissionCheck()

    }

    private fun permissionCheck() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {  // start
            // 1. 읽기권한 체크
            var permissionCheck = ContextCompat.checkSelfPermission(this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)
            // 1.1 읽기권한 없으면 요청
            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                        100)
            }


            // 2. 쓰기권한 체크
            permissionCheck = ContextCompat.checkSelfPermission(this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)
            // 2.1 쓰기권한이 없으면 요청
            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,
                        arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),100)
            }

            // 3.카메라 권한체크
            permissionCheck = ContextCompat.checkSelfPermission(this,
                    Manifest.permission.CAMERA)
            // 3.1 권한이 없으면 요청
            if (permissionCheck != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,
                        arrayOf(Manifest.permission.CAMERA), 100)
            }

        }  // end


    }
}
