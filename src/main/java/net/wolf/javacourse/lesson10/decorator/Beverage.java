/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.decorator;

/**
 * Абстрактные напитки
 *
 * @author Andrey
 */
public abstract class Beverage {

        public enum Size {
                TALL, GRANDE, VENTI
        };
        
        Size size = Size.TALL;
        
        protected String description = "Абстрактный напиток";

        public String getDescription() {
                return description;
        }

        public void setSize(Size size) {
                this.size = size;
        }

        public Size getSize() {
                return this.size;
        }

        public abstract double cost();
}
