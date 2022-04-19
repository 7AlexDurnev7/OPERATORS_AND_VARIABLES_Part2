package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hours, minutes, seconds;
        Scanner in = new Scanner(System.in);
        System.out.println(" Вудите количество секунд");
        seconds = in.nextInt();
        in.close();
        hours = seconds / 3600;
        minutes = seconds / 60 % 60;
        int sec = seconds % 60;
        System.out.println( "Составит " + hours + " часов "+  minutes + " минут "  + sec + " секунд ");
    }
}