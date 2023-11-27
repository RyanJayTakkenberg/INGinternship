package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.Herbivore;
import com.ing.zoo.animals.interfaces.Performance;

import java.util.Random;

public class Pig implements Animals, Herbivore, Carnivore, Performance {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "splash i am a pigg and my name is " + name;
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
