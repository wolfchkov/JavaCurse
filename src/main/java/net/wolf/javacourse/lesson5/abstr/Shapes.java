/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.abstr;


/**
 *
 * @author Andrey
 */
public class Shapes {
    
    public static void main(String[] args) {
        Shape quad = new QuadShape(25, 10, 10, "RED");
        Shape circle = new CircleShape(25, 5, 5, "GREEN");
        
        System.out.println(quad);
        System.out.println("\t\t Периметр: " + quad.getPerimeter() + "; Площадь: " + quad.getSquare());
        
        System.out.println(circle);
        System.out.println("\t\t Периметр: " + circle.getPerimeter() + "; Площадь: " + circle.getSquare());
        
        
    }
}
