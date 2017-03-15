/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.niof;

import java.nio.file.Paths;
import java.nio.file.Path;


/**
 *
 * @author Andrey
 */
public class PathExamples {

        /**
         * Выводим результаты различных методов класса Path
         * @param path 
         */
        static void pathMethods(Path path) {

                System.out.format("");
                System.out.format("Methods for Path : %s%n", path.toString());
                System.out.format("\tgetFileName: %s%n", path.getFileName());
                System.out.format("\tgetName(0): %s%n", path.getName(0));
                System.out.format("\tgetNameCount: %d%n", path.getNameCount());
                
                if (path.getNameCount() > 2)  {
                        System.out.format("\tsubpath(0,2): %s%n", path.subpath(0, 2));
                }
                
                System.out.format("\tgetParent: %s%n", path.getParent());
                System.out.format("\tgetRoot: %s%n", path.getRoot());
                System.out.format("\tisAbsolute: %b%n", path.isAbsolute());
                System.out.format("\ttoUri: %s%n", path.toUri());
                System.out.format("\ttoAbsolutePath: %s%n", path.toAbsolutePath());
                System.out.format("\tgetFileSystem: %s%n", path.getFileSystem());
        }
        
        static void joinPaths() {
                Path path1 = Paths.get("E:","install","putty","pscp.exe");
                System.out.format("toAbsolutePath: %s%n", path1.toAbsolutePath());
                
                Path path2 = Paths.get("E:\\install","putty","pscp.exe");
                System.out.format("toAbsolutePath: %s%n", path2.toAbsolutePath());
                
                Path path3 = Paths.get("E:\\install");
                Path path4 = Paths.get("putty","pscp.exe");
                System.out.format("toAbsolutePath: %s%n", path3.resolve(path4).toAbsolutePath());
        }
        
        static void relativePaths() {
                Path path1 = Paths.get("E:\\Install\\putty\\pscp.exe");
                Path path2 = Paths.get("E:\\music");
                System.out.format("%s%n", path1.relativize(path2));
                System.out.format("%s%n", path1.relativize(path2).toAbsolutePath());
                
        }
        
        public static void main(String[] args) {
                //pathMethods(Paths.get("E:\\Install\\putty\\pscp.exe"));
                //pathMethods(Paths.get(".\\"));
                //joinPaths();
                relativePaths();
        }
}
