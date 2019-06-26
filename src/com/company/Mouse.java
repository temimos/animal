package com.company;

public class Mouse extends Animal {
    public Mouse() {
        super();
        System.out.println("I am a Mouse");
    }


    @Override
    public String sleep() {
        return "A Mouse sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A Mouse eats...";
    }
    public String squeek()
    {
        return "A Mouse squeeks";
    }


}


