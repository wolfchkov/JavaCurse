/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.templatemethod;

/**
 *
 * @author Andrey
 */
public class Tea extends CaffeineBeverage{

        @Override
        protected void brew() {
                System.out.println("Завариваем чай...");
        }

        @Override
        protected void addCondiments() {
                System.out.println("Добавляем лимон...");
        }
        
}
