/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Пример использования FileInputStream и FileOutputStream.
 *
 * @author Andrey
 */
public class CopyBytes {

    public static void main(String[] args) throws IOException {

        try (InputStream in = new FileInputStream("c:\\javaio\\bio\\test.txt");) {
            try (OutputStream out = new FileOutputStream("c:\\javaio\\nio\\test.txt");) {
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            }
        }
    }
}
