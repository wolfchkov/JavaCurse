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
public interface Observer {
        
        /**
         * Обновленние данных о погоде 
         * @param temp температура 
         * @param humidity влажность
         * @param pressure давление
         */
        void update(float temp, float humidity, float pressure);
        
}
