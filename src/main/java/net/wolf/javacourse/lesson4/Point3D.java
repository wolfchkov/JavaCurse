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

        public Point3D(float z, float x, float y) {
                super(x, y);
                this.z = z;
        }

        public float getZ() {
                return z;
        }

}
