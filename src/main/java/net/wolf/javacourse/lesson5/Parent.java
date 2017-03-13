/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5;

/**
 *
 * @author Admin
 */
public class Parent {
    
    public void getValue() {
        System.out.println("Parent getValue");
    }
    
    public void print() {
        getValue();
        System.out.println("Parent print ");
    }
}
