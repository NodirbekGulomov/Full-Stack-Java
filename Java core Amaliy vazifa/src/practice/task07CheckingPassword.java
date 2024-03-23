package practice;

import java.util.Scanner;

public class task07CheckingPassword {
    String password;
    boolean numbers = false;
    boolean uppercase = false;
    boolean lowercase = false;
    boolean symbols = false;

    public static void main(String[] args) {
        task07CheckingPassword checkingPassword = new task07CheckingPassword();
        checkingPassword.input();
        checkingPassword.checkingPassword();
        checkingPassword.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        password = scanner.next();
    }

    public void checkingPassword() {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') { // Checking if the password contains a number
                numbers = true;
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') { // Check if the password is uppercase
                uppercase = true;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') { // Check if the password is lowercase
                lowercase = true;
            } else if (password.charAt(i) >= '!' && password.charAt(i) <= '~') { // Check if the password has a character
                symbols = true;
            }
            if (numbers && uppercase && lowercase && symbols) {
                break;
            }
        }
    }

    public void output() {
        System.out.println(numbers && uppercase && lowercase && symbols);
    }
}
