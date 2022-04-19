package com.company;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Запрашиваем число начала диапазона
        System.out.println( "Введите начальный диапазон");
        int begin = in.nextInt();
        // Запрашиваем конечную точку диапазона
        System.out.println( "Введите конечный диапазон");
        int finish = in.nextInt();
        // Запрашиваем число для дальнейшего определения его диапазона
        System.out.println(" Введите число: ");
        int between = in.nextInt();
        // Прописываем услове для определения числововго диапазона
        // в диапазоне заданных чисел
        if (between > begin && between < finish) {
            System.out.println(" Число находится в заданном диапазоне ");
        }  else {   // Прописываем условие для определения вне диапазона заданных чисел
            if (between < begin || between > finish) {
                System.out.println(" Число не находится в заданном диапазоне ");
            } else {   // Условие если заданное число является границей заданных чисел
                System.out.println( " Число является границей диапазона");
            }
        }
    }
}
