// package college_lab.lab5;

import java.util.Scanner;

class Weather {
    private String cityName;
    private double temperature;
    private double humidity;
    private String forecast;

    public Weather(String cityName, double temperature, double humidity) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.forecast = Forecast.predictWeather(temperature, humidity);
    }

    public void displayWeather() {
        System.out.println("\n" + cityName + ": " + temperature + "°C, " +
                humidity + "% humidity - Forecast: " + forecast);
    }

    static class Forecast {
        public static String predictWeather(double temperature, double humidity) {
            if (temperature > 30) {
                return humidity > 70 ? "Stormy" : "Sunny";
            } else if (temperature > 20) {
                return humidity > 60 ? "Rainy" : "Sunny";
            } else if (temperature > 10) {
                return humidity > 70 ? "Rainy" : "Cloudy";
            } else {
                return humidity > 60 ? "Snowy" : "Cloudy";
            }
        }
    }
}

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("===== WEATHER FORECAST SYSTEM =====");

        Weather[] cities = {
                new Weather("New York", 22.5, 65.0),
                new Weather("Tokyo", 18.2, 72.5),
                new Weather("Dubai", 35.8, 45.2),
                new Weather("London", 12.3, 80.0),
                new Weather("Moscow", 5.1, 68.7)
        };

        for (Weather city : cities) {
            city.displayWeather();
        }

        System.out.println("\nDirect forecasts using static nested class:");
        System.out.println("Miami (33°C, 85%): " + Weather.Forecast.predictWeather(33, 85));
        System.out.println("Paris (15°C, 55%): " + Weather.Forecast.predictWeather(15, 55));
        System.out.println("Oslo (2°C, 70%): " + Weather.Forecast.predictWeather(2, 70));
    }
}
