package com.epam.oop.polymorphism;

public class Tiger extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Tiger is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }
}