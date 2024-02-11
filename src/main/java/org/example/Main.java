package org.example;

import java.util.Scanner;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        double dl1, dl2, sh1, sh2, d; // Создадим основные переменные, которые в дальнейщем будут использоваться для ей
        double earth_d = 6371; // Укажим диаметр Земли, чтобы в дальнейшем использовать его в формуле для вычисления.
        int check = 1; // Создадим переменную для проверки продолжения цикла
        Scanner sc = new Scanner(System.in); // Создадим переменную для считывания данных с консоли
        while (check == 1) // Укажим условие цикла, который позволит использовать программу многократно.
        {
            System.out.println("Введите широту и долготу 1 точки - "); // Считаем широту и долготу для 1 координаты
            sh1 = sc.nextDouble();
            dl1 = sc.nextDouble();
            System.out.println("Введите широту и долготу 2 точки - "); // Считаем широту и долготу для 2 координаты
            sh2 = sc.nextDouble();
            dl2 = sc.nextDouble();
            sh1 = sh1*0.0174533; // Переведем все значения, введённые пользователем в радианы
            sh2 = sh2*0.0174533;
            dl1 = dl1*0.0174533;
            dl2 = dl2*0.0174533;
            d = 2*earth_d*Math.asin(Math.sqrt(Math.pow(Math.sin((sh2-sh1)/2),2)+(Math.cos(sh1)*Math.cos(sh2)*Math.pow(Math.sin((dl2-dl1)/2),2)))); // Использую формула гаверсинусов, просчитаем конечное расстояние от 1 координаты до 2
            System.out.print("Расстояние в км - ");
            System.out.println(d); // Выведем итог пользователю
            System.out.println("Если хотите продолжить введите 1");
            check = sc.nextInt(); // Проверим, желает ли пользователь использовать программу.
        }
    }
}
