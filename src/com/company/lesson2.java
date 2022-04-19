package com.company;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input 4 unit");
        int sum = in.nextInt();
        int number1 = sum % 10;
        int number2 = ( sum / 10) % 10;
        int number3 = ( sum / 100) % 10;
        int number4 =  sum / 1000;
        int result = (number1 * 1000) + ( number2 * 100) + ( number3 * 10) + number4;
       System.out.printf( "Число:  %d , Сумма : %d" , result, (sum + result));
    }
}
