package com.example.practice.service;

import com.example.practice.repository.Lecture1RepositoryImpl;
import com.example.practice.repository.Lecture1RepositoryNoSpring;
import org.springframework.stereotype.Service;


// 실제 클라이언트는 Lecture1ServiceNoSpring을 구현한 Lecture1ServiceImpl을 구현한 Lectur1ServiceImpl을 사용하
//여 데이터를 액세스하게 구현
@Service
public class Lecture1ServiceImpl implements Lecture1ServiceNoSpring{


    //변수 선언
    private final Lecture1RepositoryNoSpring lecture1Repository;


    //생성자
    public Lecture1ServiceImpl(Lecture1RepositoryImpl lecture1Repository) {
        this.lecture1Repository = lecture1Repository;
    }

    //저장, 데이터의 key는 String, value는 String으로 지정


    @Override
    public void saveValue(String key, String value) {
           lecture1Repository.saveValue(key,value);
    }

    //homework(String key) 메서드를 만든 후 service에서 구현
    @Override
    public void homework(String key) {
        lecture1Repository.homework(key);
    }
}
