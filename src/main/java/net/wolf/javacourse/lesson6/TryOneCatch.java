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
public class TryOneCatch {

        public static void main(String[] args) {
                Object obj = null;
                try {

                        if (ThreadLocalRandom.current().nextInt() % 2 == 0) {
                                int a = 45 / 0;
                        } else {                                
                                String objStr = obj.toString();
                        }

                } catch (ArithmeticException | NullPointerException ae) {

                        System.err.println("Мы либо поделили на 0 либо обратились к null ссылке!");
                        System.err.println(ae.getClass().getName());
                } 

                System.err.println("А это мы написали после try-catch!");
        }
}
