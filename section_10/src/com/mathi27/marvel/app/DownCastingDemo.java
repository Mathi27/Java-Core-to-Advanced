package com.mathi27.marvel.app;

import com.mathi27.marvel.animals.Cat;
import com.mathi27.marvel.animals.Dog;
import com.mathi27.marvel.base.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog; // upcasting

        dog = (Dog) anm; // downcasting
        AnimalUtility.performAction(dog);

        if (anm instanceof Cat ) {
            Cat cat = (Cat) anm;
        }

    }

}
