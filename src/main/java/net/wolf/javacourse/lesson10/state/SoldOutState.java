/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.state;

/**
 *
 * @author Andrey
 */
class SoldOutState implements State {

        private final GumballMachine gumballMachine;

        public SoldOutState(GumballMachine gumballMachine) {
                this.gumballMachine = gumballMachine;
        }

        @Override
        public void insertQuarter() {
                System.out.println("Вы не можете вставить четвертак, все распроданно.");
        }

        @Override
        public void ejectQuarter() {
                System.out.println("Нечего возвращать");
        }

        @Override
        public void turnCrank() {
                System.out.println("Ручка повернута, но все распроданно");
        }

        @Override
        public void dispense() {

        }

        @Override
        public void refill() {
                gumballMachine.noQuarter();
        }

        @Override
        public String toString() {
                return "распроданно";
        }
}
