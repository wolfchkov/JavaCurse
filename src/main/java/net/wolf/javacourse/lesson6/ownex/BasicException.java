/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.ownex;

/**
 * Базовое исключение нашей программы
 * @author Andrey
 */
public class BasicException extends Exception{

        public BasicException() {
        }

        public BasicException(String message) {
                super(message);
        }

        public BasicException(String message, Throwable cause) {
                super(message, cause);
        }

        public BasicException(Throwable cause) {
                super(cause);
        }
        
}
