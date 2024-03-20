package practice;

import java.util.Scanner;

public class task01SecondLargestElement {
    int max;
    int out;
    boolean sameNumber = false;

    public static void main(String[] args) {
        task01SecondLargestElement secondLargestElement = new task01SecondLargestElement();
        secondLargestElement.input();
        secondLargestElement.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) { // Enter numbers.
            numbers[i] = scanner.nextInt();
        }
        max = numbers[0];
        out = numbers[0];
        for (int i = 1; i < numbers.length; i++) {  // Finding the second-largest element in an array of integers.
            secondLargestElement(numbers[i]);
        }
    }

    public void secondLargestElement(int numbers) {
        if (max < numbers) { // Finding the largest element in an array of integers.
            out = max;
            max = numbers;
            sameNumber = true;
        } else if (out < numbers) { // Finding the second-largest element in an array of integers.
            out = numbers;
        }
    }

    public void output() {
        if (sameNumber) {
            System.out.println(out);
        }
    }

}
