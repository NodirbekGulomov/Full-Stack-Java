package practice;

import java.util.Scanner;

public class task09AreaOfRectangle {
    float a;
    float b;
    float surface;

    public static void main(String[] args) {
        task09AreaOfRectangle areaOfRectangle = new task09AreaOfRectangle();
        areaOfRectangle.input();
        areaOfRectangle.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
    }

    public float calculateSurface() {
        surface = a * b;
        return surface;
    }

    public void output() {
        System.out.println("Surface " + calculateSurface());
    }
}
