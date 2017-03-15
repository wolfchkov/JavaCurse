/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Andrey
 */
public class CopyChars {

        static void copyByChar(String fileFrom, String fileTo) throws IOException {
                FileReader inputStream = null;
                FileWriter outputStream = null;

                try {
                        inputStream = new FileReader(fileFrom);
                        outputStream = new FileWriter(fileTo);

                        int c;
                        while ((c = inputStream.read()) != -1) {
                                outputStream.write(c);
                        }
                } finally {
                        if (inputStream != null) {
                                inputStream.close();
                        }
                        if (outputStream != null) {
                                outputStream.close();
                        }
                }
        }

        static void copyByLine(String fileFrom, String fileTo) throws IOException {
                BufferedReader inputStream = null;
                PrintWriter outputStream = null;

                try {
                        inputStream = new BufferedReader(new FileReader(fileFrom));
                        outputStream = new PrintWriter(new FileWriter(fileTo));

                        String l;
                        while ((l = inputStream.readLine()) != null) {
                                outputStream.println(l);
                        }
                } finally {
                        if (inputStream != null) {
                                inputStream.close();
                        }
                        if (outputStream != null) {
                                outputStream.close();
                        }
                }
        }

        public static void main(String[] args) throws IOException {

                copyByChar("D:\\book.txt", "E:\\book.txt");
        }
}
