package com.collection;

import org.springframework.stereotype.Service;

@Service("lyricHolder")
public class LyricHolder2 {
    private String value = "'You be the DJ, I'll be the driver'";

    @Override
    public String toString(){
        return "LyricHolder: { " + value + " }";
    }
}
