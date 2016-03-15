package com.epam.oop.polymorphism;

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
