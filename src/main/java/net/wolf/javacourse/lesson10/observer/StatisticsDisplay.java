/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.observer;

import java.util.Objects;

/**
 *
 * @author Andrey
 */
public class StatisticsDisplay implements Observer, DisplayElement {

        private final String id;
        private float maxTemp = 0.0f;
        private float minTemp = 100.0f;
        private float tempSum = 0.0f;
        private int numReadings;

        public StatisticsDisplay(String id, Subject subject) {
                this.id = id;
                subject.registerObserver(this);
        }

        public void update(float temp, float humidity, float pressure) {
                tempSum += temp;
                numReadings++;

                if (temp > maxTemp) {
                        maxTemp = temp;
                }

                if (temp < minTemp) {
                        minTemp = temp;
                }

                display();
        }

        public void display() {
                System.out.printf("Средняя/Максимальная/Минимальная температура = %f/%f/%f %n", (tempSum / numReadings),
                        maxTemp, minTemp);
        }

        @Override
        public int hashCode() {
                int hash = 3;
                hash = 41 * hash + Objects.hashCode(this.id);
                return hash;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                        return true;
                }
                if (obj == null) {
                        return false;
                }
                if (getClass() != obj.getClass()) {
                        return false;
                }
                final StatisticsDisplay other = (StatisticsDisplay) obj;
                if (!Objects.equals(this.id, other.id)) {
                        return false;
                }
                return true;
        }
        
        
        

}
