/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.interfc.example;

/**
 * Класс легкового автомобиля
 * @author Andrey
 */
public class Car implements Runable {

    @Override
    public void run() {
        System.out.println("Я гоняю на колесах!");
    }

}
