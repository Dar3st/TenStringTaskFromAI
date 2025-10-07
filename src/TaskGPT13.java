import java.util.Scanner;

public class TaskGPT13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите своё число: ");
        int inputValue = scanner.nextInt();
        formattedValue(inputValue);
    }
    private static void formattedValue(int value){
        String valueString = String.valueOf(value);
        System.out.println("Сейчас ваше число в виде строки: "
                + valueString
                + " и вы не можете выполнить математические операции над ним");

        value = Integer.parseInt(valueString);
        System.out.println("Теперь ваше число имеет тип int = "
                + value
                + " и мы можем выполнить математические действия "
                + value
                + " * 2"
                + " = "
                + value * 2);
    }
}
