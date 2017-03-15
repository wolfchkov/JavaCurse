/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.bytes;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Andrey
 */
public class AbstractionPower {
        
        
        public static long readDataSum(InputStream is) {
                long sum = 0;
                
                int b;                
                try {
                        while ( (b = is.read()) != -1) {
                                sum += b;
                        }
                } catch (IOException ex) {
                        System.out.println("При чтении входного потока произошла ошибка, " + ex);
                }
                
                return sum;
        }
        
        public static void main(String[] args) {
                
               
        }
}
