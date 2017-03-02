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
public class DoWhileLoop {

    static void printNum(int count) {
        int i = 1;

        do  {
            System.out.print(i + " ");
            i++;
        } while (i < count);

    }

    static void infinityLoop() {

        int i = 1;

        do  {
            System.out.print(i + " ");
            i++;
        } while (true);

    }

    static void breakLoop(int count) {

        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
            if (i == 10) {
                break;
            }
        } while (true);

    }

    static void whileContinue(int lowBound, int count) {

        int i = 0;

        do {
            if (i == count) {
                break;
            }

            System.out.print(i + " ");

            i++;
            if (i > lowBound) {
                continue;
            }

            System.out.println();

        }  while (true);

    }

    public static void main(String args[]) {
        infinityLoop();
        
    }
}
