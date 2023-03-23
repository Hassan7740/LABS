package com.lap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Flat f = (Flat) context.getBean("proxy");

        System.out.println(f.getMyNum("hassan"));

        Validator v = (Validator) context.getBean("proxy1", "");

        try {
            v.validate(10);
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
