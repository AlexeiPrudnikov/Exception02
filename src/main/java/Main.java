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

    public static void main(String[] args) {
        System.out.print("Введите число типа float:");
        System.out.println(inputFloat());
    }
}
