/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.interfc.example;

/**
 * Класс рыбы 
 * @author Andrey
 */
public class Fish implements Swimable {

    @Override
    public void swim() {
        System.out.println("Я рыбка и плаваю с помощью хвоста!");
    }
    
}
