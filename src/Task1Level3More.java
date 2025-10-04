import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1Level3More {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = {"9806567890", "89990980644", "+79005556134", "89160164366"};

        for(String number : input) {
            String digits = number;
            if (digits.startsWith("+7")) {
                digits = digits.substring(2);
            } else if (digits.startsWith("8")) {
                digits = digits.substring(1);
            }

            String formatted = "+7-" + digits.substring(0, 3) + "-" +
                    digits.substring(3, 6) + "-" +
                    digits.substring(6, 8) + "-" +
                    digits.substring(8);

            System.out.println(number + " -> " + formatted);
            isValidPhoneNumber(formatted);
            System.out.println("---"); // разделитель для читаемости
        }
        s.close();
    }

    public static void isValidPhoneNumber(String number) {
        // ИСПРАВЛЕННОЕ регулярное выражение для формата +7-XXX-XXX-XX-XX
        String baseRegex = "\\+7-(\\d{3})-(\\d{3})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(baseRegex);
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            System.out.println("Код оператора: " + "\t\t\t" + matcher.group(1)); // Первые 3 цифры после +7-
            System.out.println("Первая часть номера: " + "\t" + matcher.group(2)); // Следующие 3 цифры
            System.out.println("Вторая часть номера: " + "\t" + matcher.group(3)); // Следующие 2 цифры
            System.out.println("Третья часть номера: " + "\t" + matcher.group(4)); // Последние 2 цифры
            System.out.println("✓ Номер телефона корректен");
        } else {
            System.out.println("✗ Неверный формат номера!");
        }
    }
}