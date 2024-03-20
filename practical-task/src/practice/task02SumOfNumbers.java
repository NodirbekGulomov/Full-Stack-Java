package practice;

import java.util.Scanner;

public class task02SumOfNumbers {
    int out;

    public static void main(String[] args) {
        task02SumOfNumbers sumOfNumbers = new task02SumOfNumbers();
        sumOfNumbers.input();
        sumOfNumbers.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) { // Enter numbers.
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) { // Find the sum of all elements in an array of integers.
            calculatingSumOfNumbers(number);
        }
    }

    public void calculatingSumOfNumbers(int number) {
        out += number;
    }

    public void output() {
        System.out.println(out);
    }
}
