package com.collection;

public abstract class AbstractLookupDemoBean implements DemoBean {

    public abstract Singer getmySinger();

    @Override
    public void doSomething() {
        getMysinger().sing();
    }
}
