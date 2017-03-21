/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson9.interaction;

/**
 *
 * @author Andrey
 */
public class Locks {
        private long c1;
        private long c2;
        
        public synchronized void upC1() {
                c1++;
        }
        
        public synchronized void upC2() {
                c2++;
        }
}
