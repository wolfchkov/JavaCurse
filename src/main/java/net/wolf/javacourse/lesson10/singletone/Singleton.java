/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.singletone;

/**
 *
 * @author Andrey
 */
public class Singleton {

        private static volatile Singleton uniqueInstance;

        // никто не может создать экземпляр
        private Singleton() {
        }

        public static Singleton getInstance() {
                Singleton instance = uniqueInstance;

                if (instance == null) {
                        synchronized (Singleton.class) {
                                if (uniqueInstance == null) {
                                        instance = new Singleton();
                                        uniqueInstance = instance;
                                }
                        }
                }
                return instance                        ;
        }
        
        public static void main(String[] args) {
                Singleton singleton = Singleton.getInstance();
                System.out.println(singleton);
                System.out.println( Singleton.getInstance());
                System.out.println( Singleton.getInstance());
                System.out.println( Singleton.getInstance());
        }        

}
