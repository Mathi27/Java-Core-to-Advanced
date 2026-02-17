package com.mathi27.marvel.app;

import com.mathi27.marvel.animals.Cat;
import com.mathi27.marvel.animals.Dog;
import com.mathi27.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Chippi");
        AnimalUtility.printName(anm);

        anm = new Dog();
        anm.setName("Kombai");
        AnimalUtility.printName(anm);

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);

    }
}
