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

    @Override
    protected void onDestroy() {
    super.onDestroy();
    realm.close();
    }
}
