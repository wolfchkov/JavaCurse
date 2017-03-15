/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson7.bytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Andrey
 */
public class Buffered {
        
        
        static void bufferedRead(String file) throws IOException {
                
                                 
                MessageDigest md5;
                try {
                        md5 = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException ex) {
                        System.err.println(ex);
                        return;
                }
                //try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file), 128 * 1024);) {
                try (FileInputStream bis = new FileInputStream(file);) {
                        DigestInputStream dis = new DigestInputStream(bis, md5);
                        while (dis.read() != -1) {
                                
                        }
                        
                }
                System.out.println("MD5: " + DatatypeConverter.printHexBinary( md5.digest() ) );
                
        }
        
        static void bufferedWrite(String file) throws IOException {                
                //try (DataOutputStream bos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));) {
                try (DataOutputStream bos = new DataOutputStream(new FileOutputStream(file));) {
                        for (int i = 0; i < 1_000_000; ++i) {
                                bos.writeInt(i);
                        }
                }
        }
 
        
        public static void main(String[] args) {
                try {
                        //bufferedRead("D:\\Films\\stylized_levi.blend");
                        bufferedWrite("D:\\test.txt");
                } catch (IOException ex) {
                        System.err.println(ex);
                }
        }
}
