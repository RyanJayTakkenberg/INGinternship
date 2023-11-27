package com.ing.zoo;


import com.ing.zoo.animals.*;
import com.ing.zoo.animals.interfaces.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Zoo {
    public static void main(String[] args) {
        Boolean wrongInput = false;

        // Array with the comments
        String[] commands = {"hello", "give leaves", "give meat", "perform trick"};


        // here i make for each class there own variable
        // so i can put it later in an Arraylist
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Shark marco = new Shark("marco");
        Eagle santosh = new Eagle("santosh");
// here i through it in an Arraylist
        ArrayList<Animals> animalsArrayList = new ArrayList<>();
        animalsArrayList.add(henk);
        animalsArrayList.add(elsa);
        animalsArrayList.add(dora);
        animalsArrayList.add(marty);
        animalsArrayList.add(wally);
        animalsArrayList.add(marco);
        animalsArrayList.add(santosh);
// the input commands
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();
        // here i put the string in  multiple parts for the last if else
        String[] parts = input.split(" ");
// here i loop trhough al the animals you can test is bij sout animals
        for (Animals animals : animalsArrayList) {
            // de first if else voor de hello
            if (input.equals(commands[0])) {
                animals.sayHello();
                wrongInput =true;
                // second for herbivore i make an instance of for the herbivore
                // it check every animal if they implements the herbivore interface if it does
                //it print the eatleaves
            } else if (input.equals(commands[1])) {
                if (animals instanceof Herbivore herbivore) {
                    herbivore.eatLeaves();
                    wrongInput =true;
                }// the same but with carnivores
            } else if (input.equals(commands[2])) {
                if (animals instanceof Carnivore carnivore) {
                    carnivore.eatMeat();
                    wrongInput =true;
                }// the seconde last   one also but then with performance
            } else if (input.equals(commands[3])) {
                if (animals instanceof Performance performance) {
                    performance.performTrick();
                    wrongInput =true;
                }// the last but nog least the parts
                // here i move it apart first check for the comment
                // and then checks wich one needs to say hello
            } else if (parts[0].equals(commands[0]) && parts[1].equals(animals.getName())) {
                animals.sayHello();
                wrongInput =true;
            }
        }

        if (!wrongInput){
                System.out.println("Unknown command: " + input);
        }

    }
}
