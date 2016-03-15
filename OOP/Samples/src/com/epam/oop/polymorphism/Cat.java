package com.epam.oop.polymorphism;

public class Cat extends Feline implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat is friendly");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
