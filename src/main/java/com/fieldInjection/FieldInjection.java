package com.fieldInjection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:application-context.xml");
        ctx.refresh();

        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();

        ctx.close();
    }
}
