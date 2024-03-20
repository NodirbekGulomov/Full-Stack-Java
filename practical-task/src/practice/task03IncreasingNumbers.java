package practice;

import java.util.Scanner;

public class task03IncreasingNumbers {
    boolean out;

    public static void main(String[] args) {
        task03IncreasingNumbers increasingNumbers = new task03IncreasingNumbers();
        increasingNumbers.input();
        increasingNumbers.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // Enter numbers
        }
        for (int i = 1; i < numbers.length; i++) {
            if (growingNumbers(numbers[i], numbers[i - 1])) { // Check if an array of integers is sorted in ascending order.
                break;
            }
        }
    }

    public boolean growingNumbers(int numbersMax, int numbersMin) {
        out = numbersMax > numbersMin; // Check if an array of integers is sorted in ascending order.
        return !out;
    }

    public void output() {
        System.out.println(out);
    }
}
