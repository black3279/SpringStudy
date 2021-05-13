package com.collection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx=  new GenericXmlApplicationContext();
        ctx.load("classpath:application-context.xml");
        ctx.refresh();

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
