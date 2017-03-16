/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.stacktrace;

import net.wolf.javacourse.lesson6.UncheckedException;

/**
 *
 * @author Andrey
 */
public class Main {
        private static final Exception EX = new Exception();
        
        public static void main(String[] args) throws Exception {
                throw EX;
                
        }
}
