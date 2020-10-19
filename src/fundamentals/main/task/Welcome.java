package fundamentals.main.task;
//1. Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class Welcome {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();
        System.out.println("Я приветсвую Вас, " + name + "! =)");
    }
}

