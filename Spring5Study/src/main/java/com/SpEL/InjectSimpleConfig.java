package com.SpEL;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleConfig {

    private String name = "이경진";
    private int age = 20;
    private float height = 190;
    private boolean programmer = false;
    private Long ageInSeconds = 7_7_7_7L;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public String toString(){
        return "이름:" + name + "\n"
                + "나이:" + age + "\n"
                + "초나이:" + ageInSeconds + "\n"
                + "키:" + height + "\n"
                + "프로그래머입니까 ?:" + programmer;
    }


}
