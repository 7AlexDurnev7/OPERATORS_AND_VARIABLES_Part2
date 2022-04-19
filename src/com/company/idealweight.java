package com.company;

import java.util.Scanner;

class idealWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println( "Введите свой рост ");
        double height = in.nextDouble();
            System.out.println ("Введите свой вес ");
        double weight = in.nextDouble();
        double ideal = height - 110;
        if (weight > ideal ) {
            System.out.println(" Вам нужно похудеть на: " + (weight - ideal) + " кг");
        } else if (weight < ideal) {
           System.out.println("Вам нужно набрать: " + (ideal - weight) + " кг");
        } else if ( weight == ideal) {
           System.out.println(" У вас идеальный вес!");
        }
    }
}
