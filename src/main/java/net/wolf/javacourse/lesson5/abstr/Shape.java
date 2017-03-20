/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.abstr;

/**
 * Абстрактный класс 
 * @author Andrey
 */
public abstract class Shape {
    
    public int a = 10;
    
    /**
     * Позиция центра фигуры по координате X
     */
    protected final int x;
    
    /**
     * Позиция центра фигуры по координате Y
     */
    protected final int y;
    
    /**
     * Цвет фигуры
     */
    protected final String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    /**
     * Получить периметр фигуры
     * @return периметр фигуры
     */
    public abstract float getPerimeter();
    
    /**
     * Получить площадь фигуры
     * @return площадь фигуры
     */    
    public abstract float getSquare();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    

    public String getColor() {
        return color;
    }
    
    
    
    
}
