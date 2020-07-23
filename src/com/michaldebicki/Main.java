package com.michaldebicki;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// przy secie nie ma duplikatów, nie można se wziąc 10 elementu jak w liście
public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        Planet temp = new Planet("Mercury",88);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Venus",225);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Earth",365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        Moon tempMoon = new Moon("Moon",27);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

//        HeavenlyBody tempStar = new HeavenlyBody("Robbie Williams",365);
//        solarSystem.put(tempStar.getName(),tempStar);
//        planets.add(tempStar);

        temp = new Planet("Mars",687);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

//        tempStar = new HeavenlyBody("Michael Jackson",0.333);
//        solarSystem.put(tempStar.getName(),tempStar);
//        planets.add(tempStar);

        tempMoon = new Moon("Deimos",1.3);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new Moon("Phobos",0.3);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

        temp = new Planet("Jupiter",4332);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        tempMoon = new Moon("Io",1.8);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new Moon("Europa",3.5);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new Moon("Callisto",16.7);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatelite(tempMoon);

        temp = new Planet("Saturn",10759);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Uranus",30660);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Neptune",165);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Pluto",248);
        planets.add(temp);


        System.out.println("Planets");
        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter",HeavenlyBody.Bodytypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for(HeavenlyBody jupiterMoon : body.getSatelites()){
            System.out.println("\t" + jupiterMoon.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatelites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getKey());
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet : planets){
            System.out.println(planet);
//            System.out.println(planet.getKey() + ": " + planet.getOrbitalPeriod());
        }

        //Object o = new Object();
        //o.equals(o);
        //"pluto".equals("");
        //control click żeby przejść do metody
        //jeśli 2 metody mają być equal to muszą mieć ten sam hashcode

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth",365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.Bodytypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.Bodytypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("The solar system contains: ");
        for(HeavenlyBody heavenlyBody : solarSystem.values()){
            System.out.println(heavenlyBody);
        }








    }
}
