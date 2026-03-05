package com.smarthost.WeatherForecast;

import java.time.LocalDate;
import java.util.List;

/**
 * Simple demo application that shows HashMap-based caching for WeatherForecast.
 *
 * This example does NOT use any external caching framework (like Redis or
 * Spring Cache). Caching is implemented manually using a {@code HashMap}.
 */
public class WeatherForecastApplication {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new CachedWeatherForecast();

        LocalDate today = LocalDate.now();

        // First call: triggers expensive computation
        List<Double> firstCall = weatherForecast.getTemperatures(today);
        System.out.println("First call result: " + firstCall);

        // Second call with the same date: served from cache, no recomputation
        List<Double> secondCall = weatherForecast.getTemperatures(today);
        System.out.println("Second call result (from cache): " + secondCall);
    }
}

