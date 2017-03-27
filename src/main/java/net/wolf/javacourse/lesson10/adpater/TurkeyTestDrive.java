/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.adpater;

/**
 *
 * @author Andrey
 */
public class TurkeyTestDrive {

        public static void main(String[] args) {
                MallardDuck duck = new MallardDuck();
                Turkey duckAdapter = new DuckAdapter(duck);

                for (int i = 0; i < 10; i++) {
                        System.out.println("Адаптер утки говорит...");
                        duckAdapter.gobble();
                        duckAdapter.fly();
                }
        }
}
