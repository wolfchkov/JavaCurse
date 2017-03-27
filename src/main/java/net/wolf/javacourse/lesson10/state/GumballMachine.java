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
public class GumballMachine {

        private final State soldOutState;
        private final State noQuarterState;
        private final State hasQuarterState;
        private final State soldState;

        State state;
        int count = 0;

        public GumballMachine(int numberGumballs) {
                soldOutState = new SoldOutState(this);
                noQuarterState = new NoQuarterState(this);
                hasQuarterState = new HasQuarterState(this);
                soldState = new SoldState(this);

                this.count = numberGumballs;
                if (numberGumballs > 0) {
                        state = noQuarterState;
                } else {
                        state = soldOutState;
                }
        }

        public void insertQuarter() {
                state.insertQuarter();
        }

        public void ejectQuarter() {
                state.ejectQuarter();
        }

        public void turnCrank() {
                state.turnCrank();
                state.dispense();
        }

        void releaseBall() {
                System.out.println("Жвачка покатился к лотку выдачи");
                if (count != 0) {
                        count--;
                }
        }

        int getCount() {
                return count;
        }

        void refill(int count) {
                this.count += count;
                state.refill();
        }

        void soldOut() {
                state = soldOutState;
        }

        void noQuarter() {
                state = noQuarterState;
        }

        void hasQuarter() {
                state = hasQuarterState;
        }

        void sold() {
                state = soldState;
        }

        public String toString() {
                StringBuilder result = new StringBuilder();
                result.append("\nLookat Pro, Inc.");
                result.append("\nJava Автомат по продаже жвачки, Модель #2105\n");
                result.append("Осталось жвачек: ").append(count);
                result.append("\nСостояние: ");
                result.append(state).append("\n");
                return result.toString();
        }

        public static void main(String[] args) {
                GumballMachine gumballMachine = new GumballMachine(2);

                System.out.println(gumballMachine);

                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();

                System.out.println(gumballMachine);

                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();
                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();

                gumballMachine.refill(5);
                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();

                System.out.println(gumballMachine);
        }
}
