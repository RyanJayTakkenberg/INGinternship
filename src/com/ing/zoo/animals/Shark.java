package com.ing.zoo.animals;

import com.ing.zoo.animals.interfaces.Animals;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.Performance;

import java.util.Random;
import java.util.Scanner;

public class Shark implements Animals, Carnivore, Performance {

    public String name;
    public String helloText;
    public String eatText;

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "I am a shark named " + name + " and i wil bite your ass ";
        System.out.println(helloText);

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatMeat() {
        eatText = "blub blub blub ";
        System.out.println(eatText);

    }

    @Override
    public void performTrick() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("I am a shark and I can count, write 1 number between 1 and 10: ");
            int input1 = scanner.nextInt();

            if (input1 >= 1 && input1 <= 10) {
                System.out.print("Now write 1 number between 10 and 20: ");
                int input2 = scanner.nextInt();

                if (input2 >= 10 && input2 <= 20) {
                    int sum = input1 * input2;
                    System.out.printf("The answer is %d\n", sum);
                    break;
                } else {
                    System.out.printf("The second number is out of range: %d\n", input2);
                }
            } else {
                System.out.printf("The first number is out of range: %d\n", input1);
            }

            System.out.println("Try again!");
        }

    }
}
