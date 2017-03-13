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
public class B {


        public void methodB(String s) {
                C c = new C();
                c.methodC(s);
        }
}
