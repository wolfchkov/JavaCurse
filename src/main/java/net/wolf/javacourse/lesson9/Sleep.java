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
public class Sleep {

        public static void main(String args[])
                throws InterruptedException {
                String importantInfo[] = {
                        "Начнем",
                        "вещание ",
                        "каждые ",
                        " 4 ", 
                        "секунды"
                };

                for (int i = 0; i < importantInfo.length; i++) {
                        //Пауза на 4 секунды
                        Thread.sleep(4000);
                        //Печатаем сообщение
                        System.out.println(importantInfo[i]);
                }
        }
}
