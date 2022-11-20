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

    //Если необходимо, исправьте данный код (задание 2
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

    public static void main(String[] args) {
        System.out.print("Введите число типа float:");
        System.out.println(inputFloat());
    }
}
