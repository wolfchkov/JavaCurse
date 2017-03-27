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
public class DuckTestDrive {

        public static void main(String[] args) {
                MallardDuck duck = new MallardDuck();

                WildTurkey turkey = new WildTurkey();
                Duck turkeyAdapter = new TurkeyAdapter(turkey);

                System.out.println("Индейка говорит...");
                turkey.gobble();
                turkey.fly();

                System.out.println("\nУтка говорит...");
                testDuck(duck);

                System.out.println("\nАдаптер идейки гвоорит...");
                testDuck(turkeyAdapter);
        }

        static void testDuck(Duck duck) {
                duck.quack();
                duck.fly();
        }
}
