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
public class CounterProblem {

        public static class Counter {

                private long count;

                public Counter() {
                        this(0);
                }
                
                public Counter(long count) {
                        this.count = count;
                }

                public long getCount() {
                    synchronized(this) {
                        return count;
                    }
                }

                public void inc() {
                    synchronized(this) {
                        count++;
                    }
                }

                public synchronized void dec() {
                        count--;
                }
        }

        public static class Incrimenter implements Runnable {

                private final Counter counter;
                
                public Incrimenter(Counter counter) {
                        this.counter = counter;
                }

                @Override
                public void run() {
                        for (int i = 0; i < 100_000; i++) {
                                counter.inc();
                        }
                }

        }

        public static void main(String[] args) throws InterruptedException {
                final Counter counter = new Counter();

                Thread th1 = new Thread(new Incrimenter(counter));
                Thread th2 = new Thread(new Incrimenter(counter));
                Thread th3 = new Thread(new Incrimenter(counter));
                Thread th4 = new Thread(new Incrimenter(counter));
                
                th1.start();
                th2.start();
                th3.start();
                th4.start();
                
                th1.join();
                th2.join();
                th3.join();
                th4.join();
                
                System.out.printf("Счетчик равен %d а должен быть равен 400_000-ам!!!!", counter.getCount());
        }
}
