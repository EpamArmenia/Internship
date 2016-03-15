package com.epam.oop.polymorphism;

public class Dog extends Feline implements Pet {
    public Dog(){}

    public Dog(Dog d){
        this.food = d.food;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
