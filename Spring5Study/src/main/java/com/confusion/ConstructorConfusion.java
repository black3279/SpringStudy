package com.confusion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructionConfusion")
public class ConstructorConfusion {

    private String someValue;

    public ConstructorConfusion(String someValue){
        System.out.println("ConstructorConfusion(String) 호출");
        this.someValue=someValue;
    }

    @Autowired
    public ConstructorConfusion(int someValue){
        System.out.println("ConstructorConfusion(int) 호출");
        this.someValue="숫자 값 : " + Integer.toString(someValue);
    }

    public String toString(){
        return someValue;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:application-context.xml");
        ctx.refresh();
        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
    }
}
