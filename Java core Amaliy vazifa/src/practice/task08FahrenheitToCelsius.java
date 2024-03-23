package practice;

import java.util.Scanner;

public class task08FahrenheitToCelsius {
    float fahrenheit;
    float celsius;

    public static void main(String[] args) {
        task08FahrenheitToCelsius fahrenheitToCelsius = new task08FahrenheitToCelsius();
        fahrenheitToCelsius.input();
        fahrenheitToCelsius.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        fahrenheit = scanner.nextFloat();
    }

    public float calculateCelsius() {
        celsius = (fahrenheit - 32) * 5.0f / 9.0f;
        return celsius;
    }

    public void output() {
        System.out.println(calculateCelsius());
    }
}
