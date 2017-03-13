/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.ownex;

/**
 * Математическое исключевние
 * @author Andrey
 */
public class MathException extends BasicException {

        public MathException(String message) {
                super(message);
        }

        public MathException(String message, Throwable cause) {
                super(message, cause);
        }
        
        
}
