package com.mathi27.marvel.hero.app;

import com.mathi27.marvel.hero.SuperHero;
import com.mathi27.marvel.hero.impl.CaptainAmerica;
import com.mathi27.marvel.hero.impl.Developer;
import com.mathi27.marvel.hero.impl.IronMan;
import com.mathi27.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {

    public static void main(String[] args) {

        System.out.println(SuperHero.UNIVERSE_NAME);

        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan);

        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        SuperHero captainAmerica = new CaptainAmerica();
        invokeSuperHero(captainAmerica);

        Developer developer = new Developer();
        developer.walk();
    }

    private static void invokeSuperHero(SuperHero superHero) {
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopVillain('N'));
    }


}
