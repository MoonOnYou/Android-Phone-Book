package com.example.moononyou.phonebookkotlin.realmJava;

import java.util.List;

import io.realm.RealmResults;
import io.realm.Sort;

public class Find{

    private List<Student> findAll(){
    RealmResults<Student> results = realm.where(Student.class)
        .findAll()
        .sort("studentId", Sort.DESCENDING);
    List<Student> list = results;

    return  list;
        }

    private Student findOndeById(int studentId){
        Student results = realm.where(Student.class)
                .equalTo("studentId",studentId)
                .findFirst();
        return results;
    }
}