/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.decorator;

/**
 * Соя
 * @author Andrey
 */
public class Soy extends CondimentDecorator {

        public Soy(Beverage beverage) {
                this.beverage = beverage;
        }

        @Override
        public String getDescription() {
                return beverage.getDescription() + ", Соя";
        }

        @Override
        public double cost() {
                double cost = beverage.cost();
                if (beverage.getSize() == Size.TALL) {
                        cost += .10;
                } else if (beverage.getSize() == Size.GRANDE) {
                        cost += .15;
                } else if (beverage.getSize() == Size.VENTI) {
                        cost += .20;
                }
                return cost;
        }
}
