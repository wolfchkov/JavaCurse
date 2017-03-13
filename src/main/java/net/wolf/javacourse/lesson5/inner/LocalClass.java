/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson5.inner;

/**
 *
 * @author Andrey
 */
public class LocalClass {
        
        
        
        public void someMethod(int var) {
                final int var2 = var;
                class MinMax {
                        private final int a;
                        private final int b;

                        MinMax(int a, int b) {
                                this.a = a;
                                this.b = b;
                        }
                        
                        int max() {
                            int c = var2 + a;
                                return a > b ? a : b;
                        }
                        
                        int min() {
                                return a < b ? a : b;
                        }                        
                }
               var = 15;
                
                MinMax minMax1 = new MinMax(10, 30);
                MinMax minMax2 = new MinMax(145640, 4654654);
                
                System.out.println(minMax1.max());
                System.out.println(minMax2.min());
        }
        
        public static void main(String[] args) {
                new LocalClass().someMethod(10);
        }
}
