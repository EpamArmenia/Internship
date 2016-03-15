package com.epam.oop.inheritance;

public class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
