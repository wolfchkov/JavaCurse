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
public class Point3D extends Point2D {
        
        protected float z;

        public Point3D(float x, float y, float z) {
            super(x);
            this.z = z;
        }
        
        public float getZ() {
            
            return z;
        }
        
        public Point2D getPoint2D() {            
            return new Point2D(x, y);
        }

}
