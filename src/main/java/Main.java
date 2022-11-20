import java.util.Scanner;

public class Main {
    // Задание № 1.
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String in = scanner.next();
                float result = Float.parseFloat(in);
                return result;
            } catch (Exception e) {
                System.out.print("Ошибка ввода. Введите число типа float:");
            }
        }
    }

    //Если необходимо, исправьте данный код (задание 2)
    // https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    //    try {
    //        int d = 0;
    //        double catchedRes1 = intArray[8] / d;
    //        System.out.println("catchedRes1 = " + catchedRes1);
    //    } catch (ArithmeticException e) {
    //        System.out.println("Catching exception: " + e);
    //    }
    public static void task02(int[] intArray, int index, int d) {
        if (d == 0) {
            throw new ArithmeticException("Деление на 0");
        }
        if (index >= intArray.length) {
            throw new IndexOutOfBoundsException();
        }
        double catchedRes1 = intArray[index] / d;
        System.out.println(catchedRes1);

    }

    //Если необходимо, исправьте данный код (задание 3)
    // https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task03v01() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void task03v02() {
        int a = 90;
        int b = 3;
        if (b == 0) {
            throw new ArithmeticException("Деление на 0");
        }
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2};
        int index = 3;
        if (index >= abc.length) {
            throw new IndexOutOfBoundsException("Выход за пределы массива.");
        }
        abc[index] = 9;

    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    // Задание № 4
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static String inputString() {
        Scanner in;
        String result;
        while (true) {
            try {
                in = new Scanner(System.in);
                // c in.next() ввод происходит пока не будет введено какое-то значение.
                result = in.nextLine();
                if (result.isEmpty()) {
                    throw new RuntimeException("Ввод пустой строки.");
                }
                return result;
            } catch (Exception ex) {
                System.out.print("Ошибка ввода. Введите непустую строку: ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите непустую строку:");
        System.out.println(inputString());

    }
}
