package com.mathi27.marvel.hero.impl;

import com.mathi27.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {


    @Override
    public String usePower() {
        return "CaptainAmerica using his power";
    }

    /**
     * If Y received kill the villain
     * If N received stop the villain
     *
     * @param c indicates Y or N
     * @return - Returns status
     */
    @Override
    public String stopVillain(char c) {
        if(c=='Y') {
            return "CaptainAmerica killed the Villain";
        } else {
            return "CaptainAmerica stopped the Villain";
        }
    }
}
