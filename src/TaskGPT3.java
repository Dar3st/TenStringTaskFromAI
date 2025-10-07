import java.util.Scanner;

public class TaskGPT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Напишите строку или слово: ");
        String input = scanner.nextLine();
        int lengthWord = input.length();
        String result = String.valueOf(lengthWord);
        System.out.println("Длина строки или слова: " + result);
    }
}
