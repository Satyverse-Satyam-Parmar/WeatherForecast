package com.smarthost.WeatherForecast;

import java.time.LocalDate;
import java.util.List;

/**
 * Simple weather forecast interface.
 *
 * Assume {@link #getTemperatures(LocalDate)} is an expensive operation
 * (e.g. remote API or database call). We will build a separate implementation
 * that caches results in memory so repeated calls for the same date do not
 * recompute the result.
 */
public interface WeatherForecast {

    /**
     * Returns a list of temperatures (e.g. hourly) for the given date.
     */
    List<Double> getTemperatures(LocalDate date);

}
