import java.util.Scanner;

public class TaskDS16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово или предложение: ");
        String input = scanner.nextLine();

        isPalindrome(input);
    }

    private static boolean isPalindrome(String input){
        if(input == null && input.isEmpty()){
            System.out.print("Вы ничего не указали");
            return false;
        }

        StringBuilder sb = new StringBuilder(input);
        String reversedWord = sb.reverse().toString();

        if(input.equalsIgnoreCase(reversedWord)){
            System.out.printf("Ваше слово или предложение читается наоборот: %s -> %s", input, reversedWord);
            return true;
        }else{
            System.out.printf("Ваше слово или предложение не читается наоборот: %s", reversedWord);
            return false;
        }
    }
}
