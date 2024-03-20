package practice;

import java.util.Scanner;

public class task05MaxAndMin {
    int max;
    int min;
    boolean sameNumber = false;

    public static void main(String[] args) {
        task05MaxAndMin maxAndMin = new task05MaxAndMin();
        maxAndMin.input();
        maxAndMin.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // Enter numbers
        }
        max = numbers[0];
        min = numbers[0];
        for (int i = 1; i < numbers.length; i++) { // Finding the maximum and minimum values in an entire array.
            findMaxMin(numbers[i]);
        }
    }

    public void findMaxMin(int numbers) {
        if (max < numbers) { // Finding the Maximal
            max = numbers;
            sameNumber = true;
        } else if (min > numbers) { // Finding the minimum
            min = numbers;
            sameNumber = true;
        }
    }

    public void output() {
        if (sameNumber) {
            System.out.println(min + ", " + max);
        }
    }
}
