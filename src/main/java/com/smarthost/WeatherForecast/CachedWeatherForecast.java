package com.smarthost.WeatherForecast;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HashMap-based caching implementation of {@link WeatherForecast}.
 *
 * The first call for a given date will run the "expensive" computation.
 * Subsequent calls for the same date will return the cached result from memory
 * without recomputing it.
 */
public class CachedWeatherForecast implements WeatherForecast {

    /**
     * In-memory cache keyed by date.
     */
    private final Map<LocalDate, List<Double>> cache = new HashMap<>();

    @Override
    public List<Double> getTemperatures(LocalDate date) {
        // If we already have data for this date, return it immediately.
        if (cache.containsKey(date)) {
            System.out.println("Returning cached temperatures for date: " + date);
            return cache.get(date);
        }

        // Otherwise, perform the expensive computation and cache the result.
        System.out.println("Computing temperatures (expensive) for date: " + date);
        List<Double> temperatures = computeTemperaturesExpensively(date);
        cache.put(date, temperatures);
        return temperatures;
    }

    /**
     * Simulates an expensive operation (e.g. remote API/DB call).
     * In a real system this is where that logic would go.
     */
    private List<Double> computeTemperaturesExpensively(LocalDate date) {
        // For demonstration we just return some hard-coded values.
        // You could add Thread.sleep(...) here to simulate latency if desired.
        return List.of(25.0, 26.5, 27.3, 28.5);
    }
}

