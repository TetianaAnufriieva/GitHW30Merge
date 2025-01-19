package package4;

import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            return;
        }

        // Создание массива
        int[] array = new int[n];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Поиск минимального значения
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальное значение в массиве: " + min);

    }
}