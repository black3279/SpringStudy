package com.autowired;

import com.annotation.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("/application-context.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);

        System.out.println(messageProvider.getMessage());
    }
}
