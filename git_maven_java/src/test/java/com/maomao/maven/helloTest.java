package com.maomao.maven;


import org.junit.Test;

public class helloTest {

    @Test
    public void sayHelloTest(){
        Hello hello = new Hello();
        String hello_text = hello.sayHello("哈哈");
        System.out.println(hello_text);
    }
}
