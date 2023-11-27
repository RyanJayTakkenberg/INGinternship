package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Herbivore;

public class Hippo implements Animals, Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "hello i am a Hippo and my name is " + name;
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
