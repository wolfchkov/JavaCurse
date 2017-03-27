/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.state.problem;

import static net.wolf.javacourse.lesson10.state.problem.GumballMachineEnum.*;

/**
 *
 * @author Andrey
 */
public class GumballMachine {

        GumballMachineEnum state = SOLD_OUT;
        int count = 0;

        public GumballMachine(int count) {
                this.count = count;
                if (count > 0) {
                        state = NO_QUARTER;
                }
        }

        public void insertQuarter() {
                if (state == HAS_QUARTER) {
                        System.out.println("Вы не можете вставить еще один четвертак.");
                } else if (state == NO_QUARTER) {
                        state = HAS_QUARTER;
                        System.out.println("Вы вставили четвертак.");
                } else if (state == SOLD_OUT) {
                        System.out.println("Вы не можете вставить четвертак, все распроданно.");
                } else if (state == SOLD) {
                        System.out.println("Подождите и вы получите жвачку...");
                }
        }

        public void ejectQuarter() {
                if (state == HAS_QUARTER) {
                        System.out.println("Четвертак возвращен");
                        state = NO_QUARTER;
                } else if (state == NO_QUARTER || state == SOLD_OUT) {
                        System.out.println("Нечего возвращать");
                } else if (state == SOLD) {
                        System.out.println("Извените, но вы провернули ручку");
                }
        }

        public void turnCrank() {
                if (state == SOLD) {
                        System.out.println("Второй раз провернув вы не получите еще одну жвачку!");
                } else if (state == NO_QUARTER) {
                        System.out.println("Ручка повернута, но вы не вставили четвертак");
                } else if (state == SOLD_OUT) {
                        System.out.println("Ручка повернута, но все распроданно");
                } else if (state == HAS_QUARTER) {
                        System.out.println("Ручка повернута...");
                        state = SOLD;
                        try {
                                Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                        dispense();
                }
        }

        private void dispense() {
                if (state == SOLD) {
                        System.out.println("Жвачка покатился к лотку выдачи");
                        count = count - 1;
                        if (count == 0) {
                                System.out.println("Упс, больше нет жвачек!");
                                state = SOLD_OUT;
                        } else {
                                state = NO_QUARTER;
                        }
                } else if (state == NO_QUARTER) {
                        System.out.println("Заплатика, дружок!");
                } else if (state == SOLD_OUT || state == HAS_QUARTER) {
                        throw new IllegalStateException("Неверный вызов метода!");
                }
        }

        public void refill(int numGumBalls) {
                this.count = numGumBalls;
                state = NO_QUARTER;
        }

        @Override
        public String toString() {
                StringBuilder result = new StringBuilder();
                result.append("\nLookat Pro, Inc.")
                        .append("\nJava Автомат по продаже жвачки, Модель #2004\n")
                        .append("Осталось жвачек: ").append(count)
                        .append("\nСостояние: ");
                if (state == SOLD_OUT) {
                        result.append("распроданно");
                } else if (state == NO_QUARTER) {
                        result.append("ожидает четвертак");
                } else if (state == HAS_QUARTER) {
                        result.append("ожидает поворота ручки");
                } else if (state == SOLD) {
                        result.append("доставка жвачки");
                }
                result.append("\n");
                return result.toString();
        }

        public static void main(String[] args) {
                GumballMachine gumballMachine = new GumballMachine(5);

                System.out.println(gumballMachine);

                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();

                System.out.println(gumballMachine);

                gumballMachine.insertQuarter();
                gumballMachine.ejectQuarter();
                gumballMachine.turnCrank();

                System.out.println(gumballMachine);

                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();
                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();
                gumballMachine.ejectQuarter();

                System.out.println(gumballMachine);

                gumballMachine.insertQuarter();
                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();
                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();
                gumballMachine.insertQuarter();
                gumballMachine.turnCrank();

                System.out.println(gumballMachine);
        }
}
