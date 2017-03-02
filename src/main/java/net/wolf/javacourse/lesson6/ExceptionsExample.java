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
public class ExceptionsExample {

    public static void exCatch() {

        try {

            if (ThreadLocalRandom.current().nextInt() % 2 == 0) {
                int a = 45 / 0;
            } else {
                Object obj = null;
                String objStr = obj.toString();
            }

        } catch (ArithmeticException ae) {

            System.err.println("Упс! Мы поделили на 0!");

        } catch (NullPointerException npe) {

            System.err.println("Упс! Мы вызвали метод у null!");

        }

        System.err.println("А это мы написали после try-catch!");
    }

    public static void exFinally() {
        int a = 0;
        try {
             a = 45 / 0;
        } catch (ArithmeticException ae) {
            System.err.println("Упс! Мы поделили на 0!");
            
        } finally {
            System.err.println("Мы в блоке finally!");
            a = -1;
        }

        System.err.println("Переменная a = "  + a);
    }

    public static void main(String[] args) {
        //exCatch();
        exFinally();
    }
}
