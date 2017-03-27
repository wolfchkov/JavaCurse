/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Andrey
 */
public class HashEquals {

    public static class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


        @Override
        public int hashCode() {
            int hash = 7;
            hash = 89 * hash + this.x;
            hash = 89 * hash + this.y;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Point other = (Point) obj;
            if (this.x != other.x) {
                return false;
            }
            return this.y == other.y;
        }

        @Override
        public String toString() {
            return "Точка(" + x + ", " + y + ") имеет hashCode => " + hashCode();
        }

    }

    public static void main(String[] args) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        Map<Integer, Point> hashCodesMap = new HashMap<>();
        int totalPoints = 1_000_000;
        int collisions = 0;
        for (int i = 0; i < totalPoints; ++i) {
            Point point = new Point(rand.nextInt(), rand.nextInt());
            int hashCode = point.hashCode();
            Point existsPoint = hashCodesMap.get(point.hashCode());
            if (existsPoint != null && !existsPoint.equals(point)) {
                //System.out.printf("Найдена коллиция для точек %n%s %n%s %n%n%n", point, existsPoint);
                collisions++;
            } else {
                hashCodesMap.put(hashCode, point);
            }
        }
        System.out.printf("На случайных %d точек найдено %d точек с колизией!", totalPoints, collisions);
    }
}
