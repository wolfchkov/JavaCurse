/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrey
 */
public class SeriaizeExamples {
        
        /**
         * запишем кол-во
        */
        static void writePoints(Point2D[] points, String file) throws IOException {
                try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file));) {                        
                        for (Point2D point : points) {
                                ous.writeObject(point);                                
                        }
                }
        }
        
        static Point2D[] readPoints(String file, int size) throws IOException, ClassNotFoundException {
                Point2D[] points = new Point2D[size];
                
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {
                        for (int i = 0; i < size; ++i) {
                               Point2D point = (Point2D) ois.readObject();
                               points[i] = point;
                        }                        
                }
                return points;
        }
        
        public static void main(String[] args) {
                Point2D[] points = {
                        new Point2D(10.555f, 15.54654f), new Point2D(10.555f, 15.54654f), new Point2D(10.555f, 15.54654f)
                };
                try {
                        writePoints(points, "D:\\points.obj");
                        
                         //Point2D[] pnts = readPoints( "D:\\points.obj", 1);
                         //System.out.println(Arrays.toString(pnts));
                } catch (IOException  ex) {
                        System.out.println(ex);
                }
        }
}
