/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.bytes;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 *
 * @author Andrey
 */
public class AbstractionPower {

    public static long readDataSum(InputStream is) {
        long sum = 0;

        int b;
        try {
            while ((b = is.read()) != -1) {
                sum += b;
            }
        } catch (IOException ex) {
            System.out.println("При чтении входного потока произошла ошибка, " + ex);
        }

        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String file = "c:\\javaio\\nio\\test.txt";
        byte[] bytes = {10, 20, 50, 10, 80};
        long sum = readDataSum(new ByteArrayInputStream(bytes));
        System.out.printf("Сумма массива %s => %d", Arrays.toString(bytes), sum);
    }
}
