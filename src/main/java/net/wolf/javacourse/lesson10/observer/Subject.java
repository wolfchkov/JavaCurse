/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.observer;

/**
 *
 * @author Andrey
 */
public interface Subject {

        /**
         * Регистрируем наблюдателя
         * @param o 
         */
        void registerObserver(Observer o);

        /**
         * Удаляем наблюдателя
         * @param o 
         */
        void removeObserver(Observer o);

        /**
         * Оповещаем всех наблюдателей
         */
        void notifyObservers();
}
