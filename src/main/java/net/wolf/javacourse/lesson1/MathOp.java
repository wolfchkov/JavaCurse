/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson1;

/**
 * Математические операции
 * @author Andrey
 */
public class MathOp {
    
    public static void main(String args[]) {
        
        /**
         * Сложение и вычитание 
         */
        int a = 55;
        int b = 125;
        int c = -100;
        
        int res = a + b;
        System.out.println( res );
        
        res = a - b;
        System.out.println( res );
        
        res = a + c;
        System.out.println( res );
        
        res = a * b;
        System.out.println( res );
        
        res = b / a;
        System.out.println( res );
    }
}
