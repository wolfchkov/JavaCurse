/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.observer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Andrey
 */
public class WeatherServer implements Subject {

        private final Set<Observer> observers;
        private float temperature;
        private float humidity;
        private float pressure;

        public WeatherServer() {
                this.observers = new HashSet<>();
        }

        @Override
        public void registerObserver(Observer o) {
                observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
                observers.remove(o);
        }

        @Override
        public void notifyObservers() {
                for (Observer o : observers) {
                        o.update(temperature, humidity, pressure);
                }
        }

        public void measurementsChanged() {
                notifyObservers();
        }

        public void setMeasurements(float temperature, float humidity, float pressure) {
                this.temperature = temperature;
                this.humidity = humidity;
                this.pressure = pressure;
                measurementsChanged();
        }

        public float getTemperature() {
                return temperature;
        }

        public float getHumidity() {
                return humidity;
        }

        public float getPressure() {
                return pressure;
        }

}
