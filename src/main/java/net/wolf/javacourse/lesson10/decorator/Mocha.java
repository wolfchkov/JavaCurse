/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.decorator;

/**
 * Мокко
 * @author Andrey
 */
public class Mocha extends CondimentDecorator {

        public Mocha(Beverage beverage) {
                this.beverage = beverage;
        }

        @Override
        public String getDescription() {
                return beverage.getDescription() + ", Мокко";
        }

        @Override
        public double cost() {
                return beverage.cost() + .20;
        }
}
