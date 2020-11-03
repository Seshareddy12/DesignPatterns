package com.business.singleton;

public class Singleton {
    private static Singleton obj=new Singleton();
    private Singleton(){};
    public static Singleton getSingleton(){
        return obj;
    }
}
