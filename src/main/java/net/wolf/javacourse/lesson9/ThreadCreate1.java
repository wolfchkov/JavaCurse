/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9;

/**
 * Первый способ создания потока
 *
 * @author Andrey
 */
public class ThreadCreate1 {

    public static class SomeThread extends Thread {

        public SomeThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.printf("Мы в отдельном потоке %s!%n",
                    Thread.currentThread().getName());
            for (int i = 0; i < 1000; ++i) {
                System.out.println(i);
            }
            System.out.printf("Поток %s завершен!%n", 
                    Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new SomeThread("our-thread");

        System.out.printf("Мы в главном потоке %s!%n", 
                Thread.currentThread().getName());
        thread.start();
        thread.join();
        System.out.printf("Завершаем программу %s!%n", Thread.currentThread().getName());

    }
}
