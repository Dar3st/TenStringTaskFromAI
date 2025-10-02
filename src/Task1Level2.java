// Задача: Напишите метод, который подсчитывает количество слов в строке
// Словом считается последовательность символов, разделенная пробелами
// Пример: "Java is great!" → 3

import java.util.Scanner;

public class Task1Level2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String input = s.nextLine();
        int result = countWords(input);
        System.out.println("Кол-во слов в вашем предложение: " + result);

    }

    /**
     * Выполнение преобразование строки в массив и цикл с счётчиком
     * вычисляем кол-во слов
     * @param text - исходная строка
     * @return - возвращаем кол-во
     */
    public static int countWords(String text) {
        String[] arrayWord = text.split(" ");
        int count = 0;
        if(!text.isEmpty()){
            for (String s : arrayWord){
                count++;
            }
        }
        return count;
    }
}
