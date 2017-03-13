/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson4.init;

/**
 *
 * @author Andrey
 */
public class SomeA {
        
        static {
               System.out.println("Выполним статическую  инициализацию SomeA");
        }
        
        {
               System.out.println("Выполним инициализацию SomeA");
        }

        public SomeA() {
                System.out.println("Констуируем SomeA");
        }
        
        public static void main(String[] args) {
                SomeA someA1 = new SomeA();
                SomeA someA2 = new SomeA();             
                SomeA someA3 = new SomeA();             
        }
        
}

