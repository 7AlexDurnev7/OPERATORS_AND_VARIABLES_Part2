package com.company;

import java.util.Scanner;

class clockforfatherchrismas {
    public static void main(String[] args) {
        int days, hours, minutes, seconds;
        // запускаем скнер
        Scanner in = new Scanner(System.in);
        // запрашиваем данные у пользователя
        System.out.println(" Введите количество секунд: ");
        seconds = in.nextInt();
        // выходим из сканера
        in.close();
        // производим конвертацию из введенных секунд в дни/часы/минуты и секудны до НГ
        days = seconds / (3600 * 24) ;
        hours = seconds / 3600 % 60;
        minutes = seconds / 60 % 60;
        seconds = seconds % 60;
        // выводим в программе расчет времени оставшегося до НГ
        System.out.println(" До Нового Года осталось " + days
                + " дней " + hours + " часов "
                + minutes + " минут " + seconds + " секунд ");
    }
}
