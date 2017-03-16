/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.interfc;

/**
 *
 * @author Andrey
 */
public class C1 implements C {

    @Override
    public void method() {
        System.out.println("Общий метод в интерфесе A и С!");
    }

    @Override
    public void methodA() {
        System.out.println("Метод в интерфесе А!");
    }

    @Override
    public void methodB() {
        System.out.println("Метод в интерфесе В!");
    }
    
   @Override
   public void methodC() {
       System.out.println("Метод в интерфесе С!");
    }    

   public static void main(String[] args) {
       C1 c1 = new C1();
       Object e = new Exception();
       
       A c2 = c1;
       
       B b = c1;
       
       C c = (C) c2;     
       
       
       
   }
   
}
