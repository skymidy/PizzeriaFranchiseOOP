package com.pizzeria.franchise;

import com.pizzeria.franchise.factorymethod.RomePizzaStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        RomePizzaStore romePizzaStore = new RomePizzaStore();

        while (true) {
            System.out.println("Welcome to Pizza Store in Rome!");
            System.out.println("Menu:");
            System.out.println("0 -> Cheese Pizza");
            System.out.println("1 -> SeaFood Pizza");
            System.out.println("9 -> exit");
            System.out.print("Make your order: ");

            int type = in.nextInt();

            if (type == 9) {
                System.out.println("Have a nice day!");
                break;
            }
            if (type > 1) {
                System.out.println("Error! Invalid number");
                continue;
            }

            Pizza pizza = romePizzaStore.orderPizza(type);

            System.out.println("Here is your " + pizza.getName() + "!");

        }

    }
}
