/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson6.ownex;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class DbResource implements Closeable{
    
    public void doSomthing() {
        System.out.println("Делаем работу в БД!!!");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Закрываем подключение к БД.");
    }
    
    public static void main(String args[]) throws IOException {
        
        
        try (DbResource dbResource = new DbResource();){
            dbResource.doSomthing();
            dbResource.doSomthing();
            dbResource.doSomthing();
            throw new IOException();
            //dbResource.doSomthing();
        } 
        
    }
    
}
