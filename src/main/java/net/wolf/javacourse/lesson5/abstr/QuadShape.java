/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.abstr;

/**
 * Квадрат
 * @author Andrey
 */
public class QuadShape extends Shape {
    public int a = 15;
    private final int width;

    public QuadShape(int width, int x, int y, String color) {
        super(x, y, color);
        this.width = width;
    }
    
    @Override
    public float getPerimeter() {
        return width * 4;
    }

    @Override
    public float getSquare() {
        return width * width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Квадрат в точке (" + x + "," + y +") cо стороной " + width;
    }
    
}
