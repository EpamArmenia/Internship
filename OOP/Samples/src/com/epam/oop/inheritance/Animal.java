package com.epam.oop.inheritance;

public class Animal {
    public String food;
    public int hunger;
    public int locationX;
    public int locationY;

    public void makeNoise(){
        System.out.println("Animal is making noise");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void roam(){
        System.out.println("Animal is roaming");
    }
}
