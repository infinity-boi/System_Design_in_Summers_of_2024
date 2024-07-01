package PracticeQuestions.Adapter;

//9. Adapter Design Pattern
//
//You are working on a weather application that displays weather information. The application already uses a standard WeatherService interface to fetch weather data from various providers. Now, you need to integrate a new weather data provider that has a different interface for fetching weather data. Your task is to use the Adapter design pattern to adapt the new provider's interface to the existing WeatherService interface.
//Requirements:
//WeatherService Interface:
//Define a common interface WeatherService for fetching weather data.
//        This interface should include methods like getTemperature(), getHumidity(), and getWindSpeed().
//Existing Concrete Weather Services:
//Implement the WeatherService interface for at least two existing weather data providers.
//
//        IndianMetDept
//        PunjabMetDept
//
//New Weather Provider:
//The new weather provider class should have a different interface with methods fetchTemperature(), fetchHumidity(), and fetchWindSpeed().
//InternationMetDept()
//Adapter Class:
//Implement an adapter class that adapts the new weather provider's interface to the WeatherService interface.
//Client Code:
//Write client code that uses the WeatherService interface to fetch and display weather data from different providers, including the new provider through the adapter.
//Objectives:
//Understand the principles of the Adapter design pattern.
//Learn how to encapsulate the adaptation logic within an adapter class.
//Gain hands-on experience in integrating a new provider with an existing system using the Adapter pattern.


public class WeatherApp {
    public static void main(String[] args) {
        // Existing providers
        WeatherService indianMetDept = new IndianMetDept();
        WeatherService punjabMetDept = new PunjabMetDept();

        System.out.println("Weather data from Indian Meteorological Department:");
        displayWeather(indianMetDept);

        System.out.println("\nWeather data from Punjab Meteorological Department:");
        displayWeather(punjabMetDept);

        // New provider using Adapter
        InternationalMetDept internationalMetDept = new InternationalMetDept();
        WeatherService internationalAdapter = new InternationalMetDeptAdapter(internationalMetDept);

        System.out.println("\nWeather data from International Meteorological Department:");
        displayWeather(internationalAdapter);
    }

    public static void displayWeather(WeatherService weatherService) {
        System.out.println("Temperature: " + weatherService.getTemperature());
        System.out.println("Humidity: " + weatherService.getHumidity());
        System.out.println("Wind Speed: " + weatherService.getWindSpeed());
    }
}

