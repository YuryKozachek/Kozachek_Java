package task;

import java.util.Scanner;

public class NumberMoreSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        enterNumberMoreSeven(number);
    }

    public static void enterNumberMoreSeven(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
