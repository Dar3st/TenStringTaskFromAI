// Задача: Напишите метод, который принимает ФИО в фор`мате "иванов иван иванович"
// и возвращает в формате "Иванов Иван Иванович"`

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String input = s.nextLine();

        String result = formatFullName(input);
        System.out.println("Отформатированный вид ФИО: " + result);
    }

    /**
     * Выполняем преобразование введёных данных пользователя
     * @param fullName - исходная строка с данным
     * @return - возвращаем отформатированную версию
     */
    public static String formatFullName(String fullName) {
        // Преобразуем полученную строку в массив и модифицируем её
        String[] arrayWord = fullName.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String stringName : arrayWord){
            if(!stringName.isEmpty()){
                char firstChar = Character.toUpperCase(stringName.charAt(0));
                String modifyAnotherWord = stringName.substring(1).toLowerCase();
                sb.append(firstChar).append(modifyAnotherWord).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
