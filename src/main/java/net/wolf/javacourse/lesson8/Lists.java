/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class Lists {
        
        
        public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
                list.add("hi");
                list.add("world");
                list.add("hello");
                list.add("cat");
                list.add("dog");
                list.add("cup");
                list.add("all");
                
                list.trimToSize();
                
                System.out.printf("list.size() => %d %n", list.size());
                System.out.printf("list.isEmpty() => %b %n", list.isEmpty());
                System.out.printf("list.get(4) => %s %n", list.get(4));
                System.out.printf("list.contains(\"dog\") => %b %n", list.contains("dog"));
                System.out.printf("list.contains(\"Dog\") => %b %n", list.contains("Dog"));
                System.out.printf("list => %s %n", list.toString());
                list.remove(1);
                System.out.printf("list.remove(1) => %s %n", list.toString());
                list.remove("cup");
                System.out.printf("list.remove(\"cup\") => %s %n", list.toString());
                list.add(0,"cheese" );
                System.out.printf("list.add(\"cheese\") => %s %n", list.toString());
                System.out.printf("list.subList(1, 3) => %s %n", list.subList(1, 3));
                Collections.shuffle(list);
                System.out.printf("Collections.shuffle(list) => %s %n", list.toString());
                list.subList(1, 3).clear();
                System.out.printf("list.subList(1, 3).clear(); => %s %n", list.toString());
                System.out.printf("list.indexOf(\"hello\") => %s %n", list.indexOf("hello"));
        }
}
