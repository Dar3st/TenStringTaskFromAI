import java.util.HashMap;
import java.util.Map;

public class TaskDS17More1 {
    public static void main(String[] args) {
        String input = "Hello java hello world";
        valueString(input.toLowerCase());
    }
    private static void valueString(String input){
        if(input == null || input.isEmpty()){
            System.out.println("Вы ничего не указали");
            return;
        }

        Map<String, Integer> stringCountMap = new HashMap<>();

        String[] words = input.split(" ");

        for(String str : words){
            stringCountMap.put(str, stringCountMap.getOrDefault(str,0) + 1);
        }

        for(Map.Entry<String, Integer> entry : stringCountMap.entrySet()){
            System.out.printf("%s = %d%n", entry.getKey(), entry.getValue());
        }
    }
}
