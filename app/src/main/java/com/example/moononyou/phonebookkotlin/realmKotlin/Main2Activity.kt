package com.example.moononyou.phonebookkotlin.realmKotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.moononyou.phonebookkotlin.R
import com.example.moononyou.phonebookkotlin.Student
import io.realm.Realm

class Main2Activity : AppCompatActivity() {
    var realm:Realm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Realm.init(applicationContext)
        realm = Realm.getDefaultInstance()
    }

    fun insertOrUpdate(student: Student) {
        realm?.executeTransaction { realm ->
            if (student.studentId == 0) {
                val maxId = realm.where(Student::class.java).max("studentId")
                val nextId = (maxId.toInt() ?: 0) + 1
                student.studentId = nextId
            }
            realm.insertOrUpdate(student)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        realm?.close()
    }
}
