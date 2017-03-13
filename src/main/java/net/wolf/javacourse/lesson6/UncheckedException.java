/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6;

/**
 *
 * @author Andrey
 */
public class UncheckedException {
         
        public String capitalize(String str){
                 String[] splited = str.split(" ");
                 StringBuilder res = new StringBuilder();
                 for (String s : splited) {
                        res.append(Character.toUpperCase(s.charAt(0)))
                                .append(s.substring(1))
                                .append(' ');
                 }
                 return res.toString();
        }
        
        public static void main(String[] args) {
                System.out.println(new UncheckedException().capitalize("жили были дед и баба"));
        }
}
