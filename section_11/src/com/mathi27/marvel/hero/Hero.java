package com.mathi27.marvel.hero;

public interface Hero {

    default void walk() {
        System.out.println("Walking");
    }

}
