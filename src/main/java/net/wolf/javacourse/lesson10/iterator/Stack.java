/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andrey
 */
public class Stack <T> implements Iterable<T>{
    
    private final ArrayList<T> stack;
    private int top = -1;

    
    public Stack(int initSize) {
        stack = new ArrayList<>(initSize);
    }

    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    /**
     * Пустой ли стек 
     * @return true если пустой, иначе false
     */
    public boolean isEmpty(){
        return top < 0;
    }
    
    /**
     * Возвращает кол-во элементов в стеке
     * @return кол-во элементов в стеке
     */
    public int size() {
        return top + 1;
    }
    
    
    /**
     * Получить значение из вершины стека, не удаляя 
     * @return значение на вершине стека , null если стек пуст 
     */
    public T getFirst() {
        if (!isEmpty()) {
            return stack.get(top);
        }
        return null;
    }
    
    /**
     * Положить в стек
     */    
    public void push(T v) {
        top ++;
        stack.add(top, v);                
    }

    /**
     * Извлечь из вершшины стека, и удалить элемент
     * @return значение на вершине стека, null если стек пуст
     */    
    public T pop() {        
        if (!isEmpty()) {
            T topObj = stack.remove(top);
            top--;
            return topObj;
        }
        return null;
    }

        @Override
        public Iterator<T> iterator() {
                return new StackIterator();
        }
        
        private class StackIterator implements Iterator<T> {
                
                private int pos = top;

                @Override
                public boolean hasNext() {
                        return pos >= 0;
                }

                @Override
                public T next() {
                        T value = stack.get(pos);
                        pos--;
                        return value;
                }
                
        }
    
        
        public static void main(String[] args) {
                Stack<Integer> stack = new Stack<>();
                stack.push(50);
                stack.push(40);
                stack.push(30);
                stack.push(1000);
                stack.push(1567);
                
            Iterator<Integer> iterator = stack.iterator();
                while (iterator.hasNext()) {                         
                        System.out.println(iterator.next());
                }
        }
    
}