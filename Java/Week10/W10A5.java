/*
 * Write a program that converts temperatures between Celsius and Fahrenheit.
 * Implement two methods, celsiusToFahrenheit and fahrenheitToCelsius, to
 * perform the conversions.
 * Use exception handling to handle invalid input temperatures (if celsius <
 * -273.15 and fahrenheit < -459.67 , program should throw exception error).
 * The TemperatureConverter class contains two methods for temperature
 * conversion (celsiusToFahrenheit and fahrenheitToCelsius).
 * The TemperatureException class is a custom exception class that extends
 * Exception and is used to handle invalid temperatures.
 * The TemperatureConverterApp class is the main class that takes user input for
 * temperatures and handles potential exceptions during the conversion process.
 * celsiusToFahrenheit = (celsius * 9 / 5) + 32
 * fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9
 */

import java.util.Scanner;

class TemperatureException extends Exception {
    public TemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    // from here
    public static double celsiusToFahrenheit(double celsius) throws TemperatureException {
        if (celsius < -273.15) {
            throw new TemperatureException("Invalid Celsius temperature (below absolute zero)");
        }
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) throws TemperatureException {
        if (fahrenheit < -459.67) {
            throw new TemperatureException("Invalid Fahrenheit temperature (below absolute zero)");
        }
        return (fahrenheit - 32) * 5 / 9;
    }
}
// till here

public class W10_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheitInput = scanner.nextDouble();
            double celsiusOutput = TemperatureConverter.fahrenheitToCelsius(fahrenheitInput);
            System.out.println("Temperature in Celsius: " + celsiusOutput);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}