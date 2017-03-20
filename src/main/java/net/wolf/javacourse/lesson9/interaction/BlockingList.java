/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9.interaction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrey
 */
public class BlockingList <T> {
        private final List<T> list;

        public BlockingList() {
                this.list = new ArrayList<>();
        }
        
        public synchronized void add(T value) {
                list.add(value);
                notifyAll();                        
        }
        
        public synchronized T get() throws InterruptedException {
                if (list.isEmpty()) {
                        wait();
                }
                return list.remove(0);
        }
        
        public static void main(String[] args) {
                final BlockingList<Integer> blockingList = new BlockingList<>();
                
                Thread reader = new Thread() {
                        @Override
                        public void run() {
                                while (true) {
                                        try {
                                                System.out.printf("В очереди появилось число %d %n", blockingList.get() );
                                        } catch (InterruptedException ex) {
                                                return;
                                        }
                                }
                        }                        
                };
                reader.start();
                        
                Thread writer = new Thread() {
                        @Override
                        public void run() {
                                while (true) {
                                        
                                        int num = ThreadLocalRandom.current().nextInt();
                                        System.out.printf("Положим число %d %n", num);
                                        blockingList.add(num);
                                        try {
                                                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 3000));
                                        } catch (InterruptedException ex) {
                                                return;
                                        }
                                }
                        }                        
                };
                writer.start();
        }
        
}
