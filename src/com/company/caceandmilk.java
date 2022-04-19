package com.company;

import java.util.Scanner;

class caceandmilk {
    public static void main(String[] args) {
        // запускаем скнер
        int pupil, percent, pie;
        Scanner in = new Scanner(System.in);
        // Запрашиваем кол-во первокласников в школе
        System.out.println(" Введите количество учеников 1 класса: ");
        pupil = in.nextInt ();
        // Запрашиваем процент первокласников весом менее 30 кг
        System.out.println( "Сколько процентов учеников имеют вес менее 30 кг: ");
        percent = in.nextInt ();
        // Закрываем сканер
        in.close();
        // задаем переменныую для расчета пирожков
        pie = 1;
        // Расчитываем сколько стаканов молока в пакете
        double packageMilk = Math.ceil((pupil * 0.2) / 0.9);
        // считаем сколько пирожков нужно для учеников вес которых менее 30 кг
        int countPie = pupil * (pie + pie);
        // условие если 100 % учеников весят меньше 30 кг
        if (percent == 100) {
            // выводим в программу расчитанные данные
            System.out.println( Math.round(packageMilk) + " пакетов молока " + " и "
                    + countPie + " пирогов нужно" +
                    " на каждый день ");
            // условие если 60 % учеников весят меньше 30 кг
        } else if (percent == 60) {
            // выводим в программу расчитанные данные
            System.out.println(Math.round (Math.ceil((packageMilk  * 60 )) / 100 )
                    + " пакетов молока " + " и " + ((countPie  * 60 / 100 ) + (pupil - percent)
                    + " пирогов нужно" + " на каждый день "));
            // условие если 1 % учеников весит меньше 30 кг
        } else if (percent == 1) {
            // выводим в программу расчитанные данные
            System.out.println(Math.round (Math.ceil((packageMilk  / 100 )))
                    + " пакетов молока "
                    + " и " + (pupil  / 100 + pupil) +  " пирогов нужно "
                    + " на каждый день ");
        }
    }
}
