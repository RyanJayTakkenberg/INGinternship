package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Carnivore;

public class Lion implements Animals, Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar i am a lion and my name is " + name;
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
