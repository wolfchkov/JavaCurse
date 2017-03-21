/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson8;

import java.io.InputStream;

/**
 * Зачем нужны обобщения?
 * @author Andrey
 */
public class GenericsProblem {
        
    
    static class ObjectHolder <T, S, U> {
        private T obj1;
        private S obj2;
        private U obj3;

        public T getObj1() {
            return obj1;
        }

        public void setObj1(T obj1) {
            this.obj1 = obj1;
        }

        public S getObj2() {
            return obj2;
        }

        public void setObj2(S obj2) {
            this.obj2 = obj2;
        }

        public U getObj3() {
            return obj3;
        }

        public void setObj3(U obj3) {
            this.obj3 = obj3;
        }

        
    }
    
    public static void main(String[] args) {
        String str = "Some string";
        ObjectHolder<Integer, String, InputStream> strHolder = new ObjectHolder<>();
        
    }
}
