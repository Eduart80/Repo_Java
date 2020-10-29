package classWork;

import java.util.Scanner;

public class input_type {
    public static void main(String[] args) {

        /*  Fahrenheit to celsius with input
         *    F = ( °C - 32) * 5/9
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Input degree in Fahrenheit: ");

        double tFahrenheit = input.nextDouble();
        double tCelsius = (tFahrenheit -32 ) * 5/9;
        System.out.println("Fahrenheit is equal to "+ tCelsius + " deg celsius.");

        /*     Fahrenheit to Celsius
         *    F = ( °C - 32) * 5/9
         */
        double taFahrenheit = 32;
        double taCelsius = (taFahrenheit -32 ) * 5/9;
        System.out.println("32 degree Fahrenheit is equal to "+ taCelsius + " degree celsius.");


    }
}
