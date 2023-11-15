package task;

import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        if (scanner.hasNextInt()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            for (int num : array) {
                if (num % 3 == 0) {
                    System.out.println(num);
                }
            }
        }
    }
}
