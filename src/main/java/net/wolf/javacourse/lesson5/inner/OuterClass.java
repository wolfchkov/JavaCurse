/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.inner;

/**
 *
 * @author Andrey
 */
public class OuterClass {

        public void method() {
                System.out.println("OuterClass.method()");
        }

        public class InnerClass {

                public void method() {
                        System.out.println("OuterClass.InnerClass.method()");
                }

                public void anotherMethod() {
                        method();
                }
        }
        
        public static void main(String[] args) {
               OuterClass outerC = new OuterClass();
               
                InnerClass innerClass = outerC.new InnerClass();
                innerClass.anotherMethod();
                
        }
        
        
}
