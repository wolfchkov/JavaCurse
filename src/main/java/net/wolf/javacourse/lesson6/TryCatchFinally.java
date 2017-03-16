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

    public static int div(int a, int b) {
        int res;
        try {
            res = a / b;
            return res;
        } catch (ArithmeticException ae) {
            System.err.println("Упс! Мы поделили на 0!");
            return -1;
        } finally {
            System.err.println("Мы в блоке finally!");            
        }       
    }

    public static void main(String[] args) {
        
        System.err.println(div(10,0));
    }
}
