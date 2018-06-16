package com.example.moononyou.phonebookkotlin.realmKotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.moononyou.phonebookkotlin.R
import com.example.moononyou.phonebookkotlin.Student
import io.realm.Realm
import io.realm.Sort

class Main2Activity : AppCompatActivity() {
    var realm:Realm? = null
    var textView:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //출력 테스트 코드
        textView = findViewById(R.id.view_txt) as TextView

        Realm.init(applicationContext)
        realm = Realm.getDefaultInstance()

        //다음은 정보입력코드
        val student1 = Student(1,"박중수",26,4)
        val student2 = Student(2,"박영환",27,4)

        insertOrUpdate(student1)
        insertOrUpdate(student2)

        val studentList = findAll()
        val oneStudent = findOneById(1)

        val sb = StringBuilder()

        sb.append("==List==\n")
        studentList?.let {
            for (student in it) {
                sb.append(student.studentId)
                        .append(".")
                        .append(student.name)
                        .append(" - ")
                        .append(student.age)
                        .append("살 - ")
                        .append(student.grade)
                        .append("학년\n")
            }
        }

        oneStudent?.let {
            sb.append("\n\n== Select One ==\n")
                    .append(oneStudent.studentId)
                    .append(". ")
                    .append(oneStudent.name)
                    .append(" - ")
                    .append(oneStudent.age)
                    .append("살 - ")
                    .append(oneStudent.grade)
                    .append("학년\n")
        }

        textView?.text = sb.toString()
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
                ?.sort("studentId", Sort.DESCENDING)

        return results
    }

    fun findOneById(studentId: Int): Student? {
        val result = realm?.where(Student::class.java)
                ?.equalTo("studentId",studentId)
                ?.findFirst()

        return result
    }

    // 트렌젝션블록을 이용한 삭제 메소드
    private fun deleteById(studentId: Int) {
        realm?.executeTransaction {
            val targetStudent = it.where(Student::class.java)
                    .equalTo("studentId",studentId)
                    .findFirst()

            targetStudent.deleteFromRealm()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        realm?.close()
    }
}
