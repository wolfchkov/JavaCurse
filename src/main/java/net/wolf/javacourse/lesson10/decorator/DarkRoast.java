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
public class DarkRoast extends Beverage {

        public DarkRoast() {
                description = "Dark Roast кофе";
        }

        @Override
        public double cost() {
                return .99;
        }
}
