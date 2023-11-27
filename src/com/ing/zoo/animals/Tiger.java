package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.Performance;

import java.util.Random;

public class Tiger implements Animals, Carnivore, Performance {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww i am a tiger and my name is " + name;
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
