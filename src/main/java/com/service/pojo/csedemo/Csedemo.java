package com.service.pojo.csedemo;

import com.service.pojo.csedemo.model.Person;

import java.util.List;


public interface Csedemo {

    Integer add(Integer a, Integer b);


    String sayHei(String name);


    String sayHello(String name);


    String sayHi(String name);


    String saySomething(String prefix, Person user);

}