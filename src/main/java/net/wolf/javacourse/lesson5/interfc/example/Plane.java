/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.interfc.example;

/**
 * Класс для самолета
 * @author Andrey
 */
public class Plane implements Flyable {

    @Override
    public void fly() {
         System.out.println("Я лечу, с помощью реактивного двигателя и крыльев!");
    }
    
    
}
