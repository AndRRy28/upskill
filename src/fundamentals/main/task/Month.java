package fundamentals.main.task;
// 5. Ввести число от 1 до 12.
//    Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        String month [] = new String [13];
        month [0] = "Не верно введённое число";
        month [1] = "Январь";
        month [2] = "Февараль";
        month [3] = "Март";
        month [4] = "Апрель";
        month [5] = "Май";
        month [6] = "Июнь";
        month [7] = "Июль";
        month [8] = "Август";
        month [9] = "Сентябрь";
        month [10] = "Октябрь";
        month [11] = "Ноябрь";
        month [12] = "Декабрь";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");
        int num = scanner.nextInt();
        if (num >= 0 && num <=12) {
            for (int i = 0; i < month.length; i++) {
                if (num == i);
            }
        System.out.println(month[num]);
        } else {
            System.out.println("Не верно введённое число");
        }
    }
}
