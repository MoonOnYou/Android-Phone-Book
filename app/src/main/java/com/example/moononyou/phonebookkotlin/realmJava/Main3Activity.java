package com.example.moononyou.phonebookkotlin.realmJava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.moononyou.phonebookkotlin.R;

import io.realm.Realm;

public class Main3Activity extends AppCompatActivity {

    private Realm realm; //Realm인스터스 클래스는 전역에서 사용하므로 클래스의 멤버변수로 선언하여 준다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();
        //Realm메소드를 초기화하고, 인스턴스를 가져와 멤버변수에 할당해준다
    }
    private void insnertOrUpdateV1(final Student student) {
        realm.beginTransaction(); //트렌젝션의 시작을 알림
        if(student.getStudentId() == 0) {
            Number maxId = realm.where( Student.class ).max( "StudentId" );
            // 어떤 모델에서 값을 조회할 것인지 설정
            int nextId = maxId == null ? 1: maxId.intValue() + 1;
            student.setStudentId( nextId );
        }
        realm.insertOrUpdate( student );
        realm.commitTransaction(); // 트렌젝션의 종료를 알림과 동시에 변경사항을 적용
    }
    @Override
    protected void onDestroy() {
    super.onDestroy();
    realm.close();
    }
}
