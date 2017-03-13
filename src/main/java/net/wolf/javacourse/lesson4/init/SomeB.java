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
public class SomeB extends SomeA{
        static {
               System.out.println("Выполним статическую  инициализацию SomeB");
        }
        
        {
               System.out.println("Выполним инициализацию SomeB");
        }

        public SomeB() {
            System.out.println("Констуируем SomeB");
        }
        
        public static void main(String[] args) {
                SomeB someB1 = new SomeB();
                SomeB someB2 = new SomeB();                
                SomeB someB3 = new SomeB();                
        }
}
