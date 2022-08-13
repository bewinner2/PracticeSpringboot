package com.example.practice;

import com.example.practice.repository.Lecture1RepositoryImpl;
import com.example.practice.service.Lecture1ServiceImpl;
import com.example.practice.service.Lecture1ServiceNoSpring;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;


@SpringBootTest
public class Lecturet1Test {

//    @Autowired
//    Lecture1RepositoryImpl lecture1Repository;


    @Autowired
    Lecture1ServiceImpl lecture1Service;


    @Test
       void Lecture1Test(){
           //    Lecture1ServiceNoSpring lecture1Service = new Lecture1ServiceImpl(new Lecture1RepositoryImpl());

           lecture1Service.saveValue("saechim","LeadMento");

           lecture1Service.homework("saechim");

           System.out.println(Lecture1SingleTon.getInstance().findByName("abcd"));
    }
}
