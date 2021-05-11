package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AscII.printNumbers();
        AscII.printLowerCase();
        AscII.printUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?:");
        String firstName = input.nextLine();
        System.out.println("Hello " + firstName);
        //name prompt

        System.out.print("Let's play a game. You down?");
        System.out.print("  Y/N: ");
        String Response = input.nextLine();
        switch (Response) {
            case "y", "Y", "yes" -> System.out.println("Sweet, let's go!");
            default -> {
                System.out.println("See you soon my friend!");
                input.close();
            }
        }
        //game prompt

        System.out.println("Do you drive a red car");
        System.out.print("  Y/N: ");
        String questions = input.nextLine();
        switch (questions) {
            case "y", "Y", "yes" -> System.out.println("Noice!");
            default -> System.out.println("Eh that's alright, we can't all be winners.");
        }
        //red car prompt

        System.out.println("What is your favorite pet's name?");
        String petName = input.nextLine();
        System.out.println(petName + "  is a great name!");
        //pet prompt

        System.out.println("How old is your pet?");
        String petAge = input.nextLine();
        //pet age prompt

        System.out.println("What is your lucky number?");
        String favNum = input.nextLine();
        System.out.println(favNum + ", nice!");
        //lucky number prompt

        System.out.println("Do you have a favorite quarterback?");
        System.out.print("  Y/N: ");
        String athlete = input.nextLine();
        if (athlete.equals("y")) {
            System.out.println("What is their number?");
            String sportNum = input.nextLine();
        }
        if (athlete.equals("Y")) {
            System.out.println("What is their number?");
            String sportNum = input.nextLine();
        }
        if (athlete.equals("N")) {
            System.out.println("That's okay.");
            String sportNum = input.nextLine();
        }
        else {
            System.out.println("");
        }
        //quarterback prompt


        System.out.println("What is two-digit model year of their car?");
        String carYr = input.nextLine();
        //car year prompt

        System.out.println("What is the name of your favorite actor?");
        String actorName = input.nextLine();
        System.out.println("I like " + actorName + " too!");
        //actor prompt

        System.out.println("Enter a random number from 1 to 50 for me!");
        String value = input.nextLine();
        System.out.println( value + " is your random number!");
        //random number prompt

        System.out.println("Do you want a lottery number?");
        System.out.print("  Y/N: ");
        String lotto = input.nextLine();
        if (lotto.equals("y")) {
            System.out.println("I want thirty percent if you win.");
            randomNumber.printLottoNumber();
        } else {
            System.out.println("Have a great day!");
        }
        //lotto prompt
    }
}
