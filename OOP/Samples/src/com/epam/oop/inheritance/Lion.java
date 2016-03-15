package com.epam.oop.inheritance;

public class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lion is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }
}
