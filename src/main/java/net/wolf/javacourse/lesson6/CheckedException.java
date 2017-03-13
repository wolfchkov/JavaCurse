/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6;

/**
 *
 * @author Andrey
 */
public class CheckedException {
        
        public double sqrt(double d) throws Exception {
                if ( d < 0) {
                        throw new Exception();
                }
                return Math.sqrt(d);
        }
        
        public static void main(String[] args) {
               
        }
}
