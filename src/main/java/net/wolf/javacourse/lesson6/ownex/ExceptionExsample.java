/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.ownex;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ExceptionExsample {
    
    
    public double sqrt(double a) throws SqrtNegativeNumberException, BadValue {
        if (a  > 0.0) {
            throw new BadValue();
        }        
        if (a < 0.0) {
            throw new SqrtNegativeNumberException();
        }
        return Math.sqrt(a);
    }
    
    
    public static void main(String args[]) {
        
        try {
            new ExceptionExsample().sqrt(-15);
        } catch (SqrtNegativeNumberException ex) {
            System.out.println(ex);
        } catch (MathException ex) {
            System.out.println(ex);
        }catch (BasicException ex) {
            System.out.println(ex);
        }
    }
}
