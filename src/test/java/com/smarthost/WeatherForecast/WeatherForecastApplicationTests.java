package com.smarthost.WeatherForecast;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Simple unit test verifying the HashMap-based caching behavior.
 *
 * This test does NOT use Spring; it directly instantiates the implementation.
 */
class WeatherForecastApplicationTests {

    @Test
    void cachedWeatherForecastReturnsSameInstanceForSameDate() {
        WeatherForecast forecast = new CachedWeatherForecast();
        LocalDate today = LocalDate.now();

        List<Double> first = forecast.getTemperatures(today);
        List<Double> second = forecast.getTemperatures(today);

        // Values are equal
        assertEquals(first, second);
        // And, because we cache the list instance, they should be the same object
        assertSame(first, second);
    }
}

