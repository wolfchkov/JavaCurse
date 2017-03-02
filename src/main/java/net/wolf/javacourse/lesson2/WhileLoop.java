/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson2;

/**
 *
 * @author Andrey
 */
public class WhileLoop {

    static void printNum(int count) {
        int i = 1;

        while (i < count) {
            System.out.print(i + " ");
            i++;
        }

    }

    static void infinityLoop() {

        int i = 1;

        while (true) {
            System.out.print(i + " ");
            i++;
        }

    }

    static void breakLoop(int count) {

        int i = 1;

        while (true) {
            System.out.print(i + " ");
            i++;
            if (i == 10) {
                break;
            }
        }

    }

    static void whileContinue(int lowBound, int count) {

        int i = 0;

        while (true) {
            if (i == count) {
                break;
            }
            

            System.out.print(i + " ");
            
            i++;            
            if (i > lowBound) {            
                continue;
            }
            
            System.out.println();            
            
            
        }

    }

    public static void main(String args[]) {
        //whileContinue(10, 30);
        //whileLoop2();
        //whileLoop3();
        //whileLoop4();
        
        for (int i = 2; i <= 100; ++i) {
            
            boolean isPrime = true;
            for (int n = 2; n < (int)Math.sqrt(i); n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            System.out.println("Число " + i + ": " + (isPrime ? "простое" : "непростое"));
        }

    }
}
