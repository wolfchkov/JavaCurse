/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6;

import java.util.Arrays;

/**
 *
 * @author Andrey
 */
public class CheckedException {
        
        public static double sqrt(double d)  {
            try {
                if ( d < 0) {
                    throw new Exception();
                }
            } catch(Exception ex) {
                
            }
                return Math.sqrt(d);
        }
        
        public static void main(String[] args)  {
            int[] a = new int[10];
            try {
                int i = 0;
                while(true){
                    a[i++] = 1;
                }
            } catch(IndexOutOfBoundsException ex) {
                
            }
            
            System.out.println(Arrays.toString(a));
        }
}
