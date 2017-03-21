/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8;

import java.util.HashMap;
import java.util.Map;
import net.wolf.javacourse.lesson4.A;
import net.wolf.javacourse.lesson4.B;
import net.wolf.javacourse.lesson4.C;

/**
 *
 * @author Admin
 */
public class Maps {
    
    public static void main(String[] args) {
        String str = "some str str some other hellow";
        String[] words = str.split(" ");
        
        Map<String, Integer> worldsFreqMap = new HashMap<>();
        
        for (String word: words) {
            Integer num = worldsFreqMap.get(word);
            if (num == null) {
                worldsFreqMap.put(word, 1);
            } else {
                worldsFreqMap.put(word, num + 1);
            }            
        }
        System.out.println(worldsFreqMap);
        
        A a = new A();
        B b = new B();
        
    }
}
