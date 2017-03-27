/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.templatemethod;

/**
 * Кофеиновый напиток
 *
 * @author Andrey
 */
public abstract class CaffeineBeverage {

        public final void prepare() {
                boilWater();
                brew();
                pourInCup();
                addCondiments();
        }

        /**
         * Завариваем/варим
         */
        protected abstract void brew();

        /**
         * Приправляем
         */
        protected abstract void addCondiments();

        /**
         * 
         */
        private void boilWater() {
                System.out.println("Кипятим воду...");
        }

        private void pourInCup() {
                System.out.println("Заливаем в чашку...");
        }
}
