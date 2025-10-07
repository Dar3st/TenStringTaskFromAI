import java.util.Scanner;

public class TaskGPT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово или предложение: ");
        String input = scanner.nextLine();
        isValidWord(input);
    }
    public static boolean isValidWord(String input){
        if(input == null || input.isEmpty()){
            System.out.println("Строка не содержит символов!");
            return false;
        }else{
            System.out.println("Строка содержит, следующее: " + input);
            return true;
        }
    }
}
