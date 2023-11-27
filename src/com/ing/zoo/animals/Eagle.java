package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Carnivore;

public class Eagle implements Animals, Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "kjie-kjie-kjie i am an Eagle calles " + name;
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatMeat() {
        eatText = "MMMHHH that was delicious thx";
        System.out.println(eatText);


    }
}
