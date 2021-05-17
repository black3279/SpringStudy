package com.collection2;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBean")
public class AbstractLookupDemoBean implements DemoBean {

    @Lookup("singer")
    public Singer getMysinger() {
        return null;
    }

    @Override
    public void doSomething() {
        getMysinger().sing();
    }
}
