/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.interfc.example;

/**
 * Класс машины амфибии
 * @author Andrey
 */
public class Amphibious implements Runable, Swimable {

    @Override
    public void run() {
        System.out.println("Я гоняю на колесах!");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю с помощью водомета!");
    }
    
}
