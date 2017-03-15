/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.bytes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 *
 * @author Andrey
 */
public class ByteIOStream {
        
         public static void bos() {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                
                for (int i = 0; i <= 100; ++i) {
                        bos.write(i);
                }
                
                 byte[] array = bos.toByteArray();
                
                System.out.println(Arrays.toString(array));      
                
        }
        
        public static void bis() {
                String s = "This is example of String";                
                ByteArrayInputStream bis  = new ByteArrayInputStream(s.getBytes());
                int b;
                while ( (b = bis.read()) != -1 ) {
                        System.out.println(Integer.toHexString(b));                        
                }
        }
        
        public static void main(String[] args) {
                bis();
                bos();
        }
}
