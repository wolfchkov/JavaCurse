/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.adpater;

/**
 *
 * @author Andrey
 */
public class WildTurkey implements Turkey {

        public void gobble() {
                System.out.println("кулдык  кулдык ");
        }

        public void fly() {
                System.out.println("Летаю на короткие дистанции");
        }
}
