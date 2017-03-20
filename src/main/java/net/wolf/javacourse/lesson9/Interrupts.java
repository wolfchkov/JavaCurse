/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9;

/**
 * Прерывание выполнения потока
 *
 * @author Andrey
 */
public class Interrupts {

        public static class Messanger implements Runnable {

                @Override
                public void run() {
                        String importantInfo[] = {
                                "Начнем",
                                "вещание ",
                                "каждые ",
                                " 4 ",
                                "секунды"
                        };

                        for (int i = 0; i < importantInfo.length; i++) {
                                try {
                                        //Пауза на 4 секунды
                                        Thread.sleep(4000);
                                } catch (InterruptedException ex) {
                                        System.out.println("Этот поток кем то завершен.");
                                        return;
                                }
                                //Печатаем сообщение
                                System.out.println(importantInfo[i]);
                        }
                }
        }
        
        /**
         * Числодробилка
         */
        public static class NumberCrusher implements Runnable {

                @Override
                public void run() {                    
                        double res = 1.0;
                        for (int i = 1; i < 10_000_000; i++) {
                                double x = (double) i;
                                res = res +  Math.sin(x) * Math.cos(1.0 / x) * Math.log(x * x);
                                //Иногда печатаем резуультат
                                if ((i % 100000) == 0) {
                                        System.out.printf("Res = %f; %n", res);
                                }
                                
                                if ((i % 1000) == 0) {
                                        if (Thread.interrupted()) {
                                                System.out.println("Поток прерван!");
                                                return;
                                        }
                                }
                        }
                        System.out.println("Завершили считать!");
                }
        }
        
        public static void main(String[] args) throws InterruptedException {
                Thread thread = new Thread(new Messanger());
                 //thread.setDaemon(true);
                thread.start();
                Thread.sleep(1000);
                //thread.interrupt();
                //System.out.println("Прервали поток!");
        }
}
