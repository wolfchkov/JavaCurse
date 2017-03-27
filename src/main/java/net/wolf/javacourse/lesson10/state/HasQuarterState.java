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
class HasQuarterState implements State {

        private final GumballMachine gumballMachine;

        public HasQuarterState(GumballMachine gumballMachine) {
                this.gumballMachine = gumballMachine;
        }

        @Override
        public void insertQuarter() {
                System.out.println("Вы не можете вставить еще один четвертак.");
        }

        @Override
        public void ejectQuarter() {
                System.out.println("Четвертак возвращен");
                gumballMachine.noQuarter();
        }

        @Override
        public void turnCrank() {
                System.out.println("Ручка повернута...");
                gumballMachine.sold();
                try {
                        Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
        }

        @Override
        public void dispense() {
                throw new IllegalStateException("Неверный вызов метода!");
        }

        @Override
        public void refill() {
        }

        @Override
        public String toString() {
                return "ожидает поворота ручки";
        }
}
