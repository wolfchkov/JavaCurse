/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.interfc.example;

/**
 *  Класс для птицы
 * @author Andrey
 */
public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Я лечу, махая крыльями и паря!");
    }
    
}
