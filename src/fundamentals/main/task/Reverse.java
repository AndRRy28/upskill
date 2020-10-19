package fundamentals.main.task;
//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class Reverse {
    public static void main(String[] args) {
        String arguments = "public static void main(String[] args) {";
        System.out.println(arguments);
        StringBuffer strBuffer = new StringBuffer(arguments);
        strBuffer.reverse();
        System.out.println(strBuffer);
    }
}
