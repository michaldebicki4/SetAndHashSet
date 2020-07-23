package com.michaldebicki;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        //true bo labrador jest instancją Doga
        System.out.println(rover.equals(rover2));
        //false bo Dog nie jest instancją Labradora
    }
}
