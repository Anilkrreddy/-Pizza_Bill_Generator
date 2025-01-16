package com.pizzabill.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for Veg Pizza, 2 for Non-Veg Pizza: ");
        int choice = scanner.nextInt();
        boolean isVeg = choice == 1;

        Pizza pizza = new Pizza(isVeg);

        System.out.println("Do you want extra cheese? (yes/no): ");
        String addCheese = scanner.next();
        if (addCheese.equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.println("Do you want extra toppings? (yes/no): ");
        String addToppings = scanner.next();
        if (addToppings.equalsIgnoreCase("yes")) {
            pizza.addExtraToppings();
        }

        System.out.println("Do you need packing? (yes/no): ");
        String packing = scanner.next();
        if (packing.equalsIgnoreCase("yes")) {
            pizza.takeAway();
        }

        System.out.println("Do you want to print the bill? (yes/no): ");
        String printBill = scanner.next();
        if (printBill.equalsIgnoreCase("yes")) {
            pizza.getBill();
        } else {
            System.out.println("Thank you for your order!");
        }

        scanner.close();
    }
}
