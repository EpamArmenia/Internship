package com.epam.oop.inheritance;

public class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wolf is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Wolf is eating");
    }
}
