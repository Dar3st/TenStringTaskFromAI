import java.util.Scanner;
// Задача: Напишите метод, который подсчитывает количество вхождений
// определенного символа в строке (без учета регистра)
// Пример использования:
// countCharIgnoreCase("Hello World", 'l') → 3
// countCharIgnoreCase("Java Programming", 'a') → 3

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Начало пользовательского ввода
        System.out.print("Введите предложение: ");
        String inputStr = scanner.nextLine();

        System.out.print("Введите искомый символ: ");
        char targetChar = scanner.next().charAt(0);
        // Конец пользовательского ввода

        // Инициализируем счётчик
        int count = countCharIgnoreCase(inputStr, targetChar);
        // Вывод инфы в консоль
        System.out.printf("Предложение \"%s\" содержит искомый символ '%c': %d раз(а)\n",
                inputStr, targetChar, count);
        scanner.close();
    }

    /**
     * Подсчитываем кол-во вхождений символа
     * в строке без учёта регистра
     * @param str - исходная строка для поиска
     * @param target - искомый символ
     * @return количество вхождений символа в строке
     */
    public static int countCharIgnoreCase(String str, char target) {
        if (str == null) return 0; // Обработка null-строки для избежания NullPointerException

        /* инициализируем ссылочную переменную типа String
        и присваиваем ей метод
        перевода в нижний регистр*/
        String lowerStr = str.toLowerCase();

        /* инициализируем примитивную переменную типа char
        * и присваиваем ей перевод символа в нижний регистр*/
        char lowerTarget = Character.toLowerCase(target);

        /*Инициализируем внутренний счётчик для метода*/
        int count = 0;

        /*Цикл со счётчиком и проверкой содержания символа в строке*/
        for (int i = 0; i < lowerStr.length(); i++) {
            if (lowerStr.charAt(i) == lowerTarget) {
                count++;
            }
        }
        // После окончания цикла возвращаем переменную счётчика
        return count;
    }
}

