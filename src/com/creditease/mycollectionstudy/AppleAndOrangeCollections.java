package com.creditease.mycollectionstudy;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange {}

public class AppleAndOrangeCollections {
    public static void main(String[] args) {
        ArrayList apples=new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (Object app:apples){
            ((Apple)app).id();
        }
    }
}
