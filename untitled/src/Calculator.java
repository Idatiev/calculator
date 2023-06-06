import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение в формате 'число операция число' от 1 до 10 включительно: ");
        String input = scanner.nextLine();


        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Ошибка: некорректный формат выражения.");
            return;
        }


        int number1, number2;
        try {
            number1 = Integer.parseInt(parts[0]);
            number2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректное числовое значение.");
            return;
        }


        int result;
        if (number1 > 10 || number2 > 10) {
            System.out.println("Введенное число больше 10");
        } else {
            switch (parts[1]) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "*" -> result = number1 * number2;
                case "/" -> {
                    if (number2 == 0) {
                        System.out.println("Ошибка: деление на ноль.");
                        return;
                    }
                    result = number1 / number2;
                }
                default -> {
                    System.out.println("Ошибка: некорректная операция.");
                    return;
                }
            }

            System.out.println("Результат: " + result);
        }
    }
}
