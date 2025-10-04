// Задача: Напишите метод для проверки валидности email адреса
// Правила: содержит @, доменная часть содержит точку, локальная часть не пустая
// Пример: isValidEmail("test@example.com") → true
// Пример: isValidEmail("invalid.email") → false

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1Level3 {
    private static String email;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите почту (формат example@mail.com): ");
        String email = s.nextLine();
        isValidEmail(email);
    }

    public static boolean isValidEmail(String email) {
        if(email == null || email.isEmpty()){
            return false;
        }

        String baseRegex = "^[A-Za-z0-9+_-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(baseRegex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }
}
