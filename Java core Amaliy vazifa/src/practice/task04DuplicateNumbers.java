package practice;

import java.util.Scanner;

public class task04DuplicateNumbers {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[scanner.nextInt()];
    int[] out = new int[numbers.length / 2];
    int index;

    public static void main(String[] args) {
        task04DuplicateNumbers duplicateNumbers = new task04DuplicateNumbers();
        duplicateNumbers.numbersLength();
    }

    public void numbersLength() {
        if (numbers.length > 1) {
            input();
            findDuplicateNumbers();
            output();
        }
    }

    public void input() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // Enter numbers
        }
    }

    public void findDuplicateNumbers() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) { // Checking numbers for duplicates
                    findDuplicateOut(numbers[i]);
                    break;
                }
            }
        }
    }

    public void findDuplicateOut(int numbers) {
        boolean dublikat = out[0] == numbers;
        if (!dublikat) {
            for (int i = 1; i < index; i++) {
                if (out[i] == numbers) { // Check for pre-existing duplicates
                    dublikat = true;
                    break;
                }
            }
        }
        if (!dublikat) { // Mastering a new duplicate
            out[index] = numbers;
            index++;
        }
    }

    public void output() {
        for (int i = 0; i < index; i++) {
            System.out.print(out[i] + ", ");
        }
    }
}
