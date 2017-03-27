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
class SoldState implements State {

        private final GumballMachine gumballMachine;

        public SoldState(GumballMachine gumballMachine) {
                this.gumballMachine = gumballMachine;
        }

        @Override
        public void insertQuarter() {
                System.out.println("Подождите и вы получите жвачку...");
        }

        @Override
        public void ejectQuarter() {
                System.out.println("Извените, но вы провернули ручку");
        }

        @Override
        public void turnCrank() {
                System.out.println("Второй раз провернув вы не получите еще одну жвачку!");
        }

        @Override
        public void dispense() {
                gumballMachine.releaseBall();
                if (gumballMachine.getCount() > 0) {
                        gumballMachine.noQuarter();
                } else {
                        System.out.println("Упс, больше нет жвачек!");
                        gumballMachine.soldOut();
                }
        }

        @Override
        public void refill() {
        }

        @Override
        public String toString() {
                return "доставка жвачки";
        }
}
