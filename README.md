🌦️ Weather Forecast Caching System
📌 Overview

This project demonstrates how to add caching to an expensive service implementation.
The goal is to prevent repeated computation when requesting weather temperatures for the same date.

The base interface:

interface WeatherForecast {
List<Double> getTemperatures(LocalDate date);
}

}

Since the underlying implementation is assumed to be expensive (e.g., API calls, heavy computation, or database queries), we introduce a caching layer that stores previously computed results.
