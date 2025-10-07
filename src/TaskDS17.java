import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskDS17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String input = scanner.nextLine()
                .toLowerCase();
        valueChar(input);
    }
    public static void valueChar (String input){
        if(input == null || input.isEmpty()) {
            System.out.println("Вы ничего не указали!");
            return;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char ch : input.toCharArray()){
            if (Character.isLetter(ch)){
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.printf("'%c' = %d%n", entry.getKey(), entry.getValue());
        }
    }
}
