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
public class ErrorsProblem {
    
    public static double sqrt(double a) {
        if (a >= 0.0) {
            return Math.sqrt(a);
        }
        return -1.0;
    }
        
    public static void main(String[] args) {
        
    }
}
