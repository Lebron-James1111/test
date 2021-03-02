package com.example.demo;

import com.example.demo.service.ServiceA;
import com.example.demo.service.ServiceB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
//    ServiceB serviceB;

    @Test
    void contextLoads() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("");

    }

}
