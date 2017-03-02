/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.abstr;

/**
 * Круг
 * @author Andrey
 */
public class CircleShape extends Shape {
    
    private final int radius;

    public CircleShape(int radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;
    }
    
    @Override
    public float getPerimeter() {
        return 2 * 3.1415f  * radius;
    }

    @Override
    public float getSquare() {
       return 3.1415f  * radius * radius / 2.0f;
    }

    public int getRadius() {
        return radius;
    }
    
    @Override
    public String toString() {
        return "Круг в точке (" + x + "," + y +") cо радиусом " + radius;
    }
    
}
