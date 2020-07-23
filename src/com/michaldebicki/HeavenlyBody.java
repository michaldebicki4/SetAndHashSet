package com.michaldebicki;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelites;


    public enum Bodytypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, Bodytypes bodyType) {
        this.key = new Key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satelites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatelite(HeavenlyBody moon){
        return this.satelites.add(moon);
    }

    public Set<HeavenlyBody> getSatelites() {

        return new HashSet<>(this.satelites);
    }

    public Key getKey() {
        return key;
    }

    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, Bodytypes bodytypes){
        return new Key(name,bodytypes);
    }

    @Override
    public String toString() {
        return  this.key.name + ": " + this.key.bodytypes + ", " + this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private Bodytypes bodytypes;

        public Key(String name, Bodytypes bodytypes) {
            this.name = name;
            this.bodytypes = bodytypes;
        }

        public String getName() {
            return name;
        }

        public Bodytypes getBodytypes() {
            return bodytypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodytypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return (this.bodytypes == key.getBodytypes());
            }else {
                return false;
            }
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodytypes;
        }
    }
}

