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
public class TurkeyAdapter implements Duck {

        Turkey turkey;

        public TurkeyAdapter(Turkey turkey) {
                this.turkey = turkey;
        }

        public void quack() {
                turkey.gobble();
        }

        public void fly() {
                for (int i = 0; i < 5; i++) {
                        turkey.fly();
                }
        }
}
