/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.ownex;

/**
 * Исключение порождающееся при извлечении квадратного корня
 * из отрицательного числа,
 * @author Andrey
 */
public class SqrtNegativeNumberException extends MathException{

        public SqrtNegativeNumberException() {
                super("Невозможно получить квадратный корень из отрицательного числа!");
        }
        
        
}
