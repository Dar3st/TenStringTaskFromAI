import java.util.Scanner;

public class TaskGPT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Впишите слово: ");
        String word = scanner.nextLine();
        outputSubstring(word);
    }
    public static void outputSubstring(String word){
        if(word != null && !word.isEmpty()){
            System.out.println(word.substring(2));
        }
    }
}
