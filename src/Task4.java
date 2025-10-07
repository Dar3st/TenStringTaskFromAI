import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String input = "vadim.nach@bk.ru";
        isValidEmail(input);
    }

    /**
     * Метод выполняет проверку почты
     * @param email - исходник почты
     * @return
     */
    public static boolean isValidEmail(String email){
        if(email == null || email.isEmpty()){
            System.out.println("Почта не указана");
            return false;
        }

        String baseRegexEmail = "[a-zA-Z0-9_\\-.]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(baseRegexEmail);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            System.out.println("Формат почты - правильный");
            return true;
        }else{
            return false;
        }
    }
}