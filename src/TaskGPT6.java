import java.util.Scanner;

public class TaskGPT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Впишите слово: ");
        String word = scanner.nextLine();
        System.out.print("Укажите старый символ: ");
        char oldCh = scanner.nextLine().charAt(0);
        System.out.print("Укажите новый символ: ");
        char newCh = scanner.nextLine().charAt(0);
        replaceChar(word, oldCh, newCh);
    }

    /**
     * Метод для замены символов в слове
     * @param word - исходное слово
     * @param oldCh - старый символ в слове
     * @param newCh - новый символ для замены
     */
    private static void replaceChar(String word, char oldCh, char newCh){
        if(word != null && !word.isEmpty()){
            char c = oldCh;
            if(Character.isLetter(c)){
                if(c >= 'a' && c <= 'z'){
                    System.out.println(word.replace(oldCh,newCh));
                } else if (c >= 'A' && c <= 'Z') {
                    System.out.println(word.replace(oldCh,newCh));
                } else if(c >= 'а' && c <= 'я'){
                    System.out.println(word.replace(oldCh,newCh));
                } else if(c >= 'А' && c <= 'Я'){
                    System.out.println(word.replace(oldCh,newCh));
                }
            }

        }
    }
}
