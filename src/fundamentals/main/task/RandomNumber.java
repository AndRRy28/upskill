package fundamentals.main.task;
//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class RandomNumber {
    public static void main(String[] args) {
        int count = 5;
        int array[] = new int[count];
        int i = 0;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
    }
}


