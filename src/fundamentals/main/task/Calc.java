package fundamentals.main.task;
//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел несколько целых чисел");
        String input = scanner.nextLine();
        String array [] = input.split(" +");
        int number [] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            number [i] = Integer.parseInt(array[i]);
            sum = sum + number[i];
            product = product * number[i];
        }
        System.out.println("Сумма введённых целочисленных значений = " + sum);
        System.out.println("Произведние введённых целочисленных значений = " + product);
    }
}
