/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9.interaction;

/**
 *
 * @author Andrey
 */
public class VolatileExample {
        
        public static class Counter extends Thread {
                
                private boolean run = true;
                
                public void stopThread() {
                        run = false;
                }
                       

                @Override
                public void run() {
                        long count = 0;
                        while (run) {
                                count++;
                        }
                        System.out.printf("Мы насчитали %d. %n", count);
                }                                
        }
        
        public static void main(String[] args) throws InterruptedException {
                Counter counter = new Counter();
                
                
                counter.start();
                Thread.sleep(1000);
                counter.stopThread();
                System.out.println("Мы остановили поток!");
        }
}
