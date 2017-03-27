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
public class CurrentWeatherDisplay implements Observer, DisplayElement {

        private final String id;
        private float temperature;
        private float humidity;
        private float pressure;

        public CurrentWeatherDisplay(String id, Subject weatherServer) {
                this.id = id;
                weatherServer.registerObserver(this);
        }

        public void update(float temperature, float humidity, float pressure) {
                this.temperature = temperature;
                this.humidity = humidity;
                this.pressure = pressure;
                display();
        }

        public void display() {
                System.out.printf("Погода:  температура %f градусов цельсия; влажность %f %%; давление %f мм.р.с.;%n",
                        temperature, humidity, pressure);
        }

        @Override
        public int hashCode() {
                int hash = 7;
                hash = 31 * hash + Objects.hashCode(this.id);
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
                final CurrentWeatherDisplay other = (CurrentWeatherDisplay) obj;
                if (!Objects.equals(this.id, other.id)) {
                        return false;
                }
                return true;
        }
        
        
}
