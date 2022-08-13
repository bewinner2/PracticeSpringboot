package com.example.practice.repository;

import com.example.practice.Lecture1SingleTon;
import lombok.extern.slf4j.Slf4j;


//해당 데이터는
//Lecture1RepositoryNoSpring인터페이스를 구현한 Lecture1RepositoryImpl로만 접근/제어가 가능
//여기는 저장소
@Slf4j
public class Lecture1RepositoryImpl implements Lecture1RepositoryNoSpring{

    @Override
    public void saveValue(String key, String value) {
        Lecture1SingleTon.getInstance().save(key,value);
    }


    //해당 메서드를 구현할 때에는 “Lecture1 과제입니다.”
    // parameter에 Key를 토대로 싱글톤 클래스
    //에서 가지고 있는 데이터의 해당 key에 대한 value를 더해서 String으로 반환하거나 로그로 출력
    @Override
    public void homework(String key) {
        String byName = Lecture1SingleTon.getInstance().findByName(key);
        log.info("\n Lecture1 과제 입니다. {}",byName);
    }
}
