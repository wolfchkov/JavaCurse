/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.serialize;

import java.io.Serializable;

/**
 *
 * @author Andrey
 */
public class Point2D implements Serializable {

    protected float x;
    protected float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Точка (" + x + ";" + y + ')';
    }

}
