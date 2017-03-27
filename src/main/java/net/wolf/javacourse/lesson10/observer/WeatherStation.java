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
public class WeatherStation {
        
	public static void main(String[] args) {
		WeatherServer weatherServer = new WeatherServer();
	
		DisplayElement currentDisplay = 
			new CurrentWeatherDisplay("cd1", weatherServer);
                                DisplayElement  statisticsDisplay = new StatisticsDisplay("sd1", weatherServer);
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherServer.setMeasurements(20, 65, 780.4f);
		weatherServer.setMeasurements(15, 70, 760.2f);
		weatherServer.setMeasurements(35, 90, 788.5f);
	}
}
