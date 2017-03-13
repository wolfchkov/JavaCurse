/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Andrey
 */
public class TryCatchFinally {
        
        //выход из метода

        public static void main(String[] args) {
                int a = 0;
                try {
                        a = 45 / 0;
                } catch (ArithmeticException ae) {
                        System.err.println("Упс! Мы поделили на 0!");

                } finally {
                        System.err.println("Мы в блоке finally!");
                        a = -1;
                }

                System.err.println("Переменная a = " + a);
        }
}
