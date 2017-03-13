/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson4;

/**
 *
 * @author Andrey
 */
public class Point2D {

    public static final float ZERO = 0.0f;

    protected float x;
    protected float y;

    public static Point2D sameXY(float c) {
        return new Point2D(c);
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

//    public Point2D() {
//        x = y = 0.f;
//    }
    protected Point2D(float c) {
        this(c, c);
    }

    public static void methodStatic() {
        System.out.println(ZERO);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}
