package com.epam.oop;

import com.epam.oop.polymorphism.*;

public class Main {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.makeNoise();
        w.roam();
        w.eat();
        w.sleep();

        Animal animals[] = new Animal[5];
        animals[0] = new Wolf();
        animals[1] = new Dog();
        animals[2] = new Lion();
        animals[3] = new Hippo();
        animals[4] = new Cat();

        for (int i = 0; i < animals.length; i++)
            Noise(animals[i]);
    }

    public static void Noise(Animal d){
        d.makeNoise();
    }
}
