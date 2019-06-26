package com.company;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("I am a Dog");
    }


    @Override
    public String sleep() {
        return "A Dog sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A Dog eats...";
    }
    public String noise()
    {
        return "A Dog barks";
    }


}
