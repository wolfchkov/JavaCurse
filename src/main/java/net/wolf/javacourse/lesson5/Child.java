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
public class Child extends Parent {
    
    @Override
    public void getValue() {
        System.out.println("Child getValue");
        super.getValue();
    }
    
    
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
    }
}
