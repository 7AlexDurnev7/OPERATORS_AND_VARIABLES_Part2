package com.company;

import java.util.Scanner;

public class cosine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print( "Введите сторону а " );
        double a = in.nextInt();
        System.out.print( "Введите сторону b " );
        double b = in.nextInt();
        System.out.print( "Введите сторону c " );
        double c = in.nextInt();
        in.close();
        double angle1 = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
        double angle2 = Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * a * c));
        double angle3 = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * b * c));
        System.out.println("Первый угол равен: " + angle1 * 180 / Math.PI);
        System.out.println("Второй угол равен: " + angle2 * 180 / Math.PI);
        System.out.println("Третий угол равен: " + angle3 * 180 / Math.PI);
        if (a + b < c || b + c < a || a + c < b) {
            System.out.println(" Треугольник не верный ");
        }  else  {
            System.out.println(" Треугольник верный ");
        }
    }
}
