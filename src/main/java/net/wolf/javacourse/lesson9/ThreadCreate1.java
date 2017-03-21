/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9;

/**
 * Первый способ создания потока
 * @author Andrey
 */
public class ThreadCreate1 {
        
        public static class SomeThread extends Thread  {
        
                @Override
                public void run() {
                        System.out.println("Мы в отдельном потоке!");
                        for(int i = 0; i < 1000; ++i) {
                                System.out.println(i);
                        }
                        System.out.println("Поток завершен!");
                }
        }
        
        public static void main(String[] args) {
                Thread thread = new SomeThread();
                
                System.out.println("Мы в главном потоке!");
                thread.start();
                while (thread.isAlive()) {
                        System.out.println("Мы в главном потоке!");
                }
                System.out.println("Завершаем программу!");
                
        }
}
