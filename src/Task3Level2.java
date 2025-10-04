// Задача: Реализуйте шифр Цезаря с заданным сдвигом
// Каждая буква заменяется на букву, стоящую на n позиций дальше в алфавите
// Пример: caesarCipher("abc", 1) → "bcd"

import java.util.Scanner;

public class Task3Level2 {
    private static boolean isWork;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Вы хотите зашифровать слово? (да/нет): ");
        String response = s.nextLine();

        if (!response.equalsIgnoreCase("да")) {
            isWork = false;
            System.out.print("Приложение заканчивает свою работу!");
        } else {
            inputString(s);
        }

        while (isWork) {
            System.out.print("Хотите ещё зашифровать слово? (да/нет): ");
            String task = s.nextLine();
            if (!task.equalsIgnoreCase("да")) {
                isWork = false;
                System.out.println("Приложение заканчивает свою работу!");
            } else {
                inputString(s);
            }
        }
        s.close();
    }

    /**
     * Объявление метода caesarCipher, который принимает два параметра:
     *
     * @param text  - исходный текст
     * @param shift - сдвиг для шифрования
     * @return - Метод возвращает строку.
     */
    public static String caesarCipher(String text, int shift) {
        if (text.isEmpty() || text == null) {
            return text;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base;
                int alphabetSize;

                if (c >= 'a' && c <= 'z') {
                    base = 'a';
                    alphabetSize = 26;
                } else if (c >= 'A' && c <= 'Z') {
                    base = 'A';
                    alphabetSize = 26;
                } else if (c >= 'а' && c <= 'я') {
                    base = 'а';
                    alphabetSize = 32;
                } else if (c >= 'А' && c <= 'Я') {
                    base = 'А';
                    alphabetSize = 32;
                } else {
                    sb.append(c);
                    continue;
                }
                int originalPos = c - base;
                int newPosition = (originalPos + shift) % alphabetSize;
                if (newPosition < 0) {
                    newPosition += alphabetSize;
                }
                char shiftedChar = (char) (base + newPosition);
                sb.append(shiftedChar);

            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static void inputString(Scanner s){
        System.out.print("Введите слово для шифровнания: ");
        String input = s.nextLine();
        String encrypted = caesarCipher(input, (int) (Math.random() * 10));
        System.out.println("Ваше слово в зашифрованном виде: " + encrypted);
    }
}
