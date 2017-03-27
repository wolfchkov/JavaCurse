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
public class Сafe {
 
        public static void main(String[] args) {
                CaffeineBeverage coffe = new Coffe();
                CaffeineBeverage tea = new Tea();
                
                coffe.prepare();
                tea.prepare();
        }
}
