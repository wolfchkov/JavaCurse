/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.serialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
        try (ObjectOutputStream ous = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));) {
            ous.writeLong(points.length);
            for (Point2D point : points) {
                ous.writeObject(point);
            }
        }
    }

    static Point2D[] readPoints(String file) throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));) {
            long size = ois.readLong();
            Point2D[] points = new Point2D[(int) size];
            for (int i = 0; i < size; ++i) {
                Point2D point = (Point2D) ois.readObject();
                points[i] = point;
            }
            return points;
        }        
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Point2D[] points = {
            new Point2D(10.555f, 15.54654f),
            new Point2D(153.555f, -15.54654f),
            new Point2D(10.555f, 15.54654f),
            new Point2D(112353.555f, -15.54654f),
            new Point2D(10.555f, 15234.54654f),
            new Point2D(15123.555f, -12315.54654f),
            new Point2D(10510.555f, 515.54654f)
        };
        try {
            writePoints(points, "C:\\javaio\\points.obj");

            Point2D[] pnts = readPoints("C:\\javaio\\points.obj");
            System.out.println(Arrays.toString(pnts));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
