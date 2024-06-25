package com.techmojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.beans.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        Person person = (Person)ctxt.getBean("person");
        System.out.println(person);
    }
}
