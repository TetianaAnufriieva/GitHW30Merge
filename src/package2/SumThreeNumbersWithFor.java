package package2;

import java.util.Scanner;

public class SumThreeNumbersWithFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите число " + i + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            sum += num;
        }

        System.out.println("Сумма трех чисел: " + sum);

    }
}