package com.configuration;

import com.configuration.MessageRenderer;
import com.configuration.StandardOutMessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.configuration"})
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
