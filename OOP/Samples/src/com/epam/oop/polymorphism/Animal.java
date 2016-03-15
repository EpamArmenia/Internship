package com.epam.oop.polymorphism;

abstract public class Animal {
    public String food;
    public int hunger;
    public int locationX;
    public int locationY;


    public abstract void eat();

    public void makeNoise(){
        System.out.println("Animal is making noise");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void roam(){
        System.out.println("Animal is roaming");
    }
}
