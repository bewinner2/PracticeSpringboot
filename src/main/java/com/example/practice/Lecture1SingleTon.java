package com.example.practice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


//Lecture1SingleTone은 자료구조
//이와 같은 자료구조를 가지고 있는 싱글톤 클래스를 만든다.
public class Lecture1SingleTon {

    private final Map<String, String> memberMap = new ConcurrentHashMap<>();  //final때문에 값 변경 불가

    private static Lecture1SingleTon SINGLETON = new Lecture1SingleTon();  //메모리공간에 하나만 존재


    //생성자
    private Lecture1SingleTon() {
    }


    //메소드  데이터를 key,value 구조로 "저장"
public void save(String name,String value){memberMap.put(name,value);}

    //메소드 조회,  key로 조회할 때에 해당 key가 존재하지 않으면 “COMMENTO” 라는 String을 반환
    public String findByName(String name){return memberMap.getOrDefault(name,"COMMENTO");}


    //클래스 메소드
    public static Lecture1SingleTon getInstance() {
        return SINGLETON;
    }  //instance새로만들지 않아도 static 메소드 호출 가능
}
