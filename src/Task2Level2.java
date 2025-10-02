import java.util.Scanner;

// Задача: Напишите метод, который находит самое длинное слово в строке
// Пример: "Java is a programming language" → "programming"
 class Task2Level2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Напишите своё предложение или набор слов: ");

        String input = s.nextLine();

        String result = findLongestWord(input);
        System.out.println("Твоё самое длинное слово - это: " + result);
    }

    /**
     * Преобразуем пользователский ввод
     * удаляем все символы перечисления
     *
     * @param text
     * @return
     */
    public static String findLongestWord(String text) {
        String[] words = text.split("[,\\s.!?;:]+");
        String longestWord = "";

        for(String s : words){
            // Удаляем все разделители в начале строки и в конце строки, но дефисы внутри слова будут сохранены
            String cleanWord = s.replaceAll("^[^a-zA-Zа-яА-ЯёЁ]+|[^a-zA-Zа-яА-ЯёЁ]+$", "");
            if(!cleanWord.isEmpty() && cleanWord.length()>longestWord.length()){
                longestWord = cleanWord;
            }
        }
        return longestWord;
    }
}
