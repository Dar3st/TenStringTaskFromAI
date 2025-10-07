import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskGPT9 {
    private static final String BASE_REGEX = "^[a-zA-Z0-9а-яА-Я?,.]+";
    public static void main(String[] args) {
        String word = "Привет, как твои дела?";
        valueOfChar(word);
    }
    public static void valueOfChar(String word){
        Pattern pattern = Pattern.compile(BASE_REGEX);
        Matcher matcher = pattern.matcher(word.replace(" ",""));

        if(matcher.matches()){
            char[] ch = word.toCharArray();
            int count = 0;
            for (char c : ch){
                String space = "";
                if(c == ' '){
                    space = "Пробел";
                }
                System.out.printf("Индекс №%d - %s%s\n", count++, c, space);
            }
            System.out.printf("Всего элементов в массиве: %d", word.length());
        }
    }
}
