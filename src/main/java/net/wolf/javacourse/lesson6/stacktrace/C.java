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
public class C {
        

        
        public void methodC(String s) {
                D d = new D();
                System.out.println(d.methodD(s));
        }
}
