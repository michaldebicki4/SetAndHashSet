package com.michaldebicki;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Bodytypes.PLANET);
    }

    @Override
    public boolean addSatelite(HeavenlyBody moon) {
        if(moon.getKey().getBodytypes() == Bodytypes.MOON){
            return  super.addSatelite(moon);
        } else {
            return false;
        }
    }
}
