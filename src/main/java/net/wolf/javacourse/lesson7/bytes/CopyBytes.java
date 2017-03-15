/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Пример использования FileInputStream и FileOutputStream.
 * @author Andrey
 */
public class CopyBytes {

        public static void main(String[] args) throws IOException {

                FileInputStream in = null;
                FileOutputStream out = null;

                try {
                        in = new FileInputStream("someFile.txt");
                        out = new FileOutputStream("someCopy.txt");
                        int c;

                        while ((c = in.read()) != -1) {
                                out.write(c);
                        }
                } finally {
                        if (in != null) {
                                in.close();
                        }
                        if (out != null) {
                                out.close();
                        }
                }
        }
}
