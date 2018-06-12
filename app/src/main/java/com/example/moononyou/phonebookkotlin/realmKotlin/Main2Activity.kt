package com.example.moononyou.phonebookkotlin.realmKotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.moononyou.phonebookkotlin.R
import com.example.moononyou.phonebookkotlin.Student
import io.realm.Realm
import io.realm.Sort

class Main2Activity : AppCompatActivity() {
    var realm:Realm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Realm.init(applicationContext)
        realm = Realm.getDefaultInstance()

        //다음은 정보입력코드
        val student1 = Student(1,"박중수",26,4)
        val student2 = Student(2,"박영환",27,4)

        insertOrUpdate(student1)
        insertOrUpdate(student2)

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

    fun findAll(): List<Student>? {
        val results = realm?.where(Student::class.java)
                ?.findAll()
                ?.sort("student", Sort.DESCENDING)

        return results
    }

    fun findOneById(studentId: Int): Student? {
        val result = realm?.where(Student::class.java)
                ?.findFirst()

        return result
    }

    override fun onDestroy() {
        super.onDestroy()
        realm?.close()
    }
}
