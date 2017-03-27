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
public class Espresso extends Beverage {

        public Espresso() {
                description = "Эспессо ";
        }

        @Override
        public double cost() {
                return 1.99;
        }
}
