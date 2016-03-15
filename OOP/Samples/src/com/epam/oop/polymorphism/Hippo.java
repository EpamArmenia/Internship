package com.epam.oop.polymorphism;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Hippo is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Hippo is eating");
    }
}
