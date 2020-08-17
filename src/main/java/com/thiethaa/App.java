package com.thiethaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ){
//        System.setProperty("spring.profiles.active","mybatis");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
}
