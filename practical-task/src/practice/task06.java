package practice;

import java.util.Scanner;

public class task06 {
    boolean security;
    boolean optimization;
    boolean perfectProgram;
    boolean normalProgram;

    public static void main(String[] args) {
        task06 task = new task06();
        task.input();
        task.check();
        task.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        security = scanner.nextBoolean();
        optimization = scanner.nextBoolean();
    }

    public void check() {
//      Checking that both variables are true (AND)
        perfectProgram = security && optimization;
//      Checking if at least one variable is true (OR)
        normalProgram = security || optimization;
    }

    public void output() {
        System.out.println("Security?        | " + security);
        System.out.println("Optimization?    | " + optimization);
        System.out.println("Perfect Program? | " + perfectProgram);
        System.out.println("Normal  Program? | " + normalProgram);
    }
}
