// Задача: Напишите метод, который проверяет, является ли строка палиндромом
// (читается одинаково слева направо и справа налево)
// Пример: "казак" → true, "привет" → false

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите слово: ");

        String input = s.nextLine();

        isPalindrome(input);
    }

    /**
     * Проверяем палиндром в вашем слове
     * @param str - исходная строка для проверки
     * @return - возвращаем правда или ложь
     */
    public static boolean isPalindrome(String str) {

        // Обработка пустой строки для избежания IllegalArgumentException
        if(str.isEmpty()) {
            System.out.println("Вы не указали слово");
            return false;
        }

        // Преобразуем пользовательскую строку и выполняем проверку
        StringBuilder sb = new StringBuilder(str); //
        sb.reverse();

        if(str.contentEquals(sb)){
            System.out.printf("Ваша строка читается одинаково слева направо и наоборот: %s -> %s", str, sb);
            return true;
        }else{
            System.out.printf("Ваша строка не читается одинаково слева направо и наоборот: %s -> %s", str, sb);
            return false;
        }
    }
}
