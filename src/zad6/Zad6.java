/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import java.util.Scanner;

/**
 *
 * @author Студент
 */
public class Zad6 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*1.	Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
         2.	Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
         3.	Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
         4.	Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
         5.	Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
         6.	При помощи цикла for вывести на экран нечетные числа от 1 до 99.
         7.	Перепишите программу с использованием цикла while.
         8.	Даны переменные x и n вычислить x^n.
         9.	Вывести 10 первых чисел последовательности 0, -5,-10,-15..
         10.	Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
         11.	Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
                Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
         */
        //1
        System.out.println("Zadanie 1");
        for (int i = 1000; i <= 1020; i = i + 3) {
            System.out.println(i + " ");

        }

        //2
        System.out.println("Zadanie 2");
        int k = 1;
        for (int i = 1; k <= 55; i = i + 2) {
            System.out.println(i + " ");
            k += 1;
        }

        //3
        System.out.println("Zadanie 3");
        for (int i = 90; i > 0; i = i - 5) {
            System.out.println(i + " ");
        }

        //4
        System.out.println("Zadanie 4");
        int l = 1;//vivedet tol'ko 20 elementov
        for (int i = 2; l <= 20; i = i + 2) {
            System.out.println(i + " ");
            l += 1;
        }

        //5
        System.out.println("Zadanie 5");
        int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("vvedite chislo  : ");
            n = scan.nextInt();
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
            if (n == 0 || n == 1) {
                System.out.println(result);
            }
            if (n < 0) {
                System.out.println("vvedeno otricatelnoe chislo");
            }
        } while (n < 0);

        //6
        System.out.println("Zadanie 6");
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.println(i + " ");
        }

        //7 Перепишите программу с использованием цикла while.
        System.out.println("Zadanie 7");
        int num = 1;
        do {
            System.out.println(num);
            num = num + 2;
        } while (num < 100);

        //8
        System.out.println("Zadanie 8");
        int x=2;
        int b=3;
        double c = Math.pow(2, 3);
        System.out.println(c + " "); 
        
        //9 Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        System.out.println("Zadanie 9");
        int r = 1;//vivedet tol'ko 20 elementov
        for (int i = 0; r <= 10; i = i - 5) {
            System.out.println(i + " ");
            r += 1;  
        }
        
        //10 Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
        System.out.println("Zadanie 10");
       
        System.out.print("vvedite chislo  : ");
       /*int h;
        //if(h%2==0){
         
            System.out.println("Число "+h+" - четное");
        }
        else {
            System.out.println("Число "+h+" - нечетное");
        }  
        
        //11 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        //Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        */
    }
}
