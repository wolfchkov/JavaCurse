/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.calculator;

/**
 * Операция вичитания
 * @author Andrey
 */
public class Substraction implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left - right;
    }
    
}
