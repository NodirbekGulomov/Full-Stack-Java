package practice;

import java.util.Scanner;

public class task10AgeOfPerson {
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int birthYear;
    int birthMonth;
    int birthDay;
    int currentYear;
    int currentMonth;
    int currentDay;
    int age;
    int month;
    int day;

    public static void main(String[] args) {
        task10AgeOfPerson ageOfPerson = new task10AgeOfPerson();
        ageOfPerson.input();
        ageOfPerson.checkingDate();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter birthYear");
        birthYear = scanner.nextInt();
        System.out.println("Enter birthMonth");
        birthMonth = scanner.nextInt();
        System.out.println("Enter birthDay");
        birthDay = scanner.nextInt();
        System.out.println("Enter currentYear");
        currentYear = scanner.nextInt();
        System.out.println("Enter currentMonth");
        currentMonth = scanner.nextInt();
        System.out.println("Enter currentDay");
        currentDay = scanner.nextInt();

    }

    public void checkingDate() {
        if (checkingYear()) {
            boolean birthDate = checkingMonth(birthYear, birthMonth, birthDay);
            boolean currentDate = checkingMonth(currentYear, currentMonth, currentDay);
            if (birthDate&&currentDate){
                calculateMonth();
                calculateDays();
                output();
            }
        } else {
            System.out.println("birthYear is greater than currentYear");
        }
    }

    public boolean checkingYear() {
        return birthYear <= currentYear;
    }

    public boolean checkingMonth(int year, int month, int day) {
        if (month > 0 && month < 13) {
            if (checkingDay(year, month, day)) {
                return true;
            } else {
                System.out.println(year + "-" + month + "-" + day + " No date");
            }
        } else {
            System.out.println(year + "-" + month + "-" + day + " No date");
        }
        return false;
    }

    public boolean checkingDay(int year, int month, int day) {
        return day > 0 && ((year % 4 == 0 && month == 3 && day < 30) || day < monthDays[month - 1]);
    }

    public void calculateMonth() {
        if (!(birthYear > currentYear)) {
            age = currentYear - birthYear;
            if (birthMonth < currentMonth) {
                month = currentMonth - birthMonth;
            } else if (birthMonth > currentMonth) {
                age--;
                month = 12 - (birthMonth - currentMonth);
            } else {
                month = 0;
            }
        }
    }

    public void calculateDays() {
        if (birthDay < currentDay) {
            day = currentDay - birthDay;
        } else if (birthDay > currentDay) {
            if (month == 0) {
                age--;
                month = 11;
            } else {
                month--;
            }
            if (currentYear % 4 == 0 && currentMonth == 3) {
                day = 29 - (birthDay - currentDay);
            } else {
                day = monthDays[currentMonth - 2] - (birthDay - currentDay);
            }
        } else {
            day = 0;
        }
    }

    public void output() {
        System.out.println(age + " year " + month + " month " + day + " day");
    }
}
