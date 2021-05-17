package com.collection2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {

    @Configuration
    @ComponentScan(basePackages = {"com.collection2"})
    public static class LookupConfig{}

    public static void main(String[] args) {
        GenericApplicationContext ctx=  new AnnotationConfigApplicationContext(LookupConfig.class);

        DemoBean abstractBean = ctx.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = ctx.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);

        ctx.close();
    }

    public static void displayInfo(String beanName, DemoBean bean){
        Singer singer1= bean.getMysinger();
        Singer singer2= bean.getMysinger();

        System.out.println("" + beanName + ": Singer 인스턴스는 같은가 ? "+ (singer1==singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for(int x= 0; x<100000;x++){
            Singer singer = bean.getMysinger();
            singer.sing();
        }

        stopWatch.stop();

        System.out.println("100000번을 얻어오는데 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "ms");
    }
}
