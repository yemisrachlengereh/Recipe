package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void showRecipe(ArrayList<String> data) {
        for (String recipe : data) {
            System.out.println(recipe);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> recipe = new ArrayList<>();
        Scanner Keyboard = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter ingredient: ");
            recipe.add(Keyboard.nextLine());

            System.out.println("Enter more ingredients? (Y/N)");

            answer = Keyboard.nextLine();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Enter directions");
        recipe.add(Keyboard.nextLine());

        showRecipe(recipe);
    }
}