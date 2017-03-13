/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.stacktrace;

/**
 *
 * @author Andrey
 */
public class A {
       
        
        public void methodA(String s) {
                B b = new B();
                b.methodB(s);
        }
}
