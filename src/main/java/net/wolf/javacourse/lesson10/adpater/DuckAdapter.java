/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.adpater;

import java.util.Random;

/**
 *
 * @author Andrey
 */
public class DuckAdapter implements Turkey {

        Duck duck;
        Random rand;

        public DuckAdapter(Duck duck) {
                this.duck = duck;
                rand = new Random();
        }

        public void gobble() {
                duck.quack();
        }

        public void fly() {
                if (rand.nextInt(5) == 0) {
                        duck.fly();
                }
        }
}
