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
class NoQuarterState implements State {

        private final GumballMachine gumballMachine;

        public NoQuarterState(GumballMachine gumballMachine) {
                this.gumballMachine = gumballMachine;
        }

        @Override
        public void insertQuarter() {
                System.out.println("Вы вставили четвертак.");
                gumballMachine.hasQuarter();
        }

        @Override
        public void ejectQuarter() {
                System.out.println("Нечего возвращать");
        }

        @Override
        public void turnCrank() {
                System.out.println("Ручка повернута, но вы не вставили четвертак");
        }

        @Override
        public void dispense() {
                System.out.println("Заплатика, дружок!");
        }

        @Override
        public void refill() {
        }

        @Override
        public String toString() {
                return "ожидает четвертак";
        }
}
