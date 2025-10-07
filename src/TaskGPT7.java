import java.util.Scanner;

public class TaskGPT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Загадано слово, угадайте его: ");
        String input  = scanner.nextLine();
        String secret = "Java is best!";
        isValidWords(secret, input);
    }

    /**
     * Метод возвращает boolean после проверки строк
     * @param secretWord - исходное слово
     * @param inputWord - пользовательский ввод
     * @return - если inputWord совпадёт с secretWord, то возвращает true, иначе false
     */
    public static boolean isValidWords(String secretWord, String inputWord){
        if(inputWord == null || inputWord.isEmpty()){
            System.out.println("Вы не указали слово!");
            return false;
        }
        if(secretWord.equalsIgnoreCase(inputWord)){
            System.out.println("Вы угадали слово!");
            return true;
        }else{
            return false;
        }
    }
}
