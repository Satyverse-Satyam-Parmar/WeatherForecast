# 🌦️ Weather Forecast Caching System

## 📌 Overview

This project demonstrates how to add **caching** to an expensive service implementation.  
The goal is to prevent repeated computation when requesting weather temperatures for the **same date**.

### Base Interface

```java
interface WeatherForecast {
    List<Double> getTemperatures(LocalDate date);
}
