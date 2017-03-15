/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.niof;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class FilesExamples {

//        for (FileSystemProvider provider : FileSystemProvider.installedProviders()) {
//                        System.out.println(provider.toString());
//                }
        /**
         * примеры методов проверок доступности файла
         */
        static void someMethods() {
                //Проверим - существует ли файл
                Path file = Paths.get("d:\\book.txt");
                System.out.printf("Files.exists : %b%n", Files.exists(file));
                System.out.printf("Files.notExists : %b%n", Files.notExists(file));

                //Можем понять, есть ли доступ к файлу
                System.out.printf("Files.isExecutable : %b%n", Files.isReadable(file));
        }

        static void delete() {
                Path file = Paths.get("d:\\book.txt");
                try {
                        Files.delete(file);
                        //Files.deleteIfExists(file);
                } catch (NoSuchFileException x) {
                        System.err.format("%s: файл или директория не существует%n", file);
                } catch (DirectoryNotEmptyException x) {
                        System.err.format("%s директория не пуста %n", file);
                } catch (IOException x) {
                        // Какая то другая проблема
                        System.err.println(x);
                }
        }

        static void copy() {
                Path src = Paths.get("d:\\book.txt");
                Path dest = Paths.get("e:\\book.txt");
                try {
                        Files.copy(src, dest, REPLACE_EXISTING);
                
                } catch (IOException x) {
                        // Какая то проблема
                        System.err.println(x);
                }
        }
        
        static void reading() {
                Path file = Paths.get("d:\\book.txt");
                
                try {
                        byte[] allBytes = Files.readAllBytes(file);
                        //List<String> allLines = Files.readAllLines(file);
                        //BufferedReader a = Files.newBufferedReader(file);
                
                } catch (IOException x) {
                        // Какая то проблема
                        System.err.println(x);
                }
        }       
        
        static void writing() {
                Path file = Paths.get("d:\\book.txt");
                
                try {
                        Files.write(file, new byte[10], TRUNCATE_EXISTING);
                        //Files.newBufferedWriter(file, options);
                        
                
                } catch (IOException x) {
                        // Какая то проблема
                        System.err.println(x);
                }
        }               

        public static void main(String[] args) {

              copy();
        }
}
