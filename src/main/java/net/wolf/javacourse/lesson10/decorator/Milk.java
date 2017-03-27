/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.decorator;

/**
 *
 * @author Andrey
 */
public class Milk extends CondimentDecorator {

        public Milk(Beverage beverage) {
                this.beverage = beverage;
        }

        @Override
        public String getDescription() {
                return beverage.getDescription() + ", Молоко";
        }

        @Override
        public double cost() {
                return beverage.cost() + .10;
        }
}
