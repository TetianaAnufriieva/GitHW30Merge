package package1;

import java.util.Scanner;

public class SumThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        int sum = num1 + num2 + num3;

        System.out.println("Сумма трех чисел: " + sum);

        scanner.close();
    }
}