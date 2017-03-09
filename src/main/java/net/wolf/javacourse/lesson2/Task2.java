/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson2;

/**
 *
 * @author Admin
 */
public class Task2 {
    
    public static void minMaxNumber(int num) {
        int min = 9;
        int max = 0;
        for (int n = num; n > 0; n /= 10) {
            int number = n % 10;
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.printf("У числа %d:%n \tМаксимальное число: %d %n \tМинимальное число %d", 
                num, max, min);
    }
    
    public static void someMethod(int i, int a, Object ... str) {
        System.out.println("i " + i);
        System.out.println("a " + a);

        for (Object s : str) {
            System.out.println("s " + s);
        }
    }
    
    public static void main (String[] args) {
        System.out.printf("");
        someMethod(0, 1, 0.54654,4.4564, 6.5646465 );
    }
    
}
