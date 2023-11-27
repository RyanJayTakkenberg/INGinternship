package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Herbivore;
import com.ing.zoo.animals.interfaces.Performance;

import java.util.Random;

public class Zebra implements Animals, Herbivore, Performance {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra my name is " + name;
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra ";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "makes a front-flip in the water";
        System.out.println(trick);
    }
}
