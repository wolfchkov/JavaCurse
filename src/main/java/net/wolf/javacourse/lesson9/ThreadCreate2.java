/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9;

/**
 *
 * @author Andrey
 */
public class ThreadCreate2 {
         public static class SomeThread implements Runnable  {
                 
                 private final int countFrom;

                public SomeThread(int countFrom) {
                         this.countFrom = countFrom;
                }
        
                @Override
                public void run() {
                        System.out.println("Мы в отдельном потоке!");
                        for(int i = countFrom; i < 1000; ++i) {
                                System.out.println(i);
                        }
                        System.out.println("Поток завершен!");
                }
        }
        
        public static void main(String[] args) {
                Thread thread = new Thread(new SomeThread(500));
                thread.setPriority(Thread.MAX_PRIORITY);
                System.out.println("Мы в главном потоке!");
                thread.start();
                while (thread.isAlive()) {
                        System.out.println("Мы в главном потоке!");
                        //Thread.yield();
                }
                System.out.println("Завершаем программу!");
                
        }
}
