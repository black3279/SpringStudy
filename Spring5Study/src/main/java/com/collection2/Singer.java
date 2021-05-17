package com.collection2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singer")
@Scope("prototype")
public class Singer {

    private String lyric = "I played a quick game of chess with the salt";

    public void sing(){

    }
}
