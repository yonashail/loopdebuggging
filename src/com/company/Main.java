package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Defining userinput
        Scanner keyboard = new Scanner(System.in);
        String userInput= "";
//prompt the user to input any word
        System.out.print("Enter a word ");
        userInput = keyboard.nextLine();

        while (!userInput.equals("")){
            System.out.print("Enter a word ");
            userInput=keyboard.nextLine();
            System.out.println(userInput);
            // write your code here
        }

        System.out.println("Goodbye");
    }

}