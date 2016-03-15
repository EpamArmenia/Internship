package com.epam.oop.inheritance;

public class Dog extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
