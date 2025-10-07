public class TaskGPT8 {
    public static void main(String[] args) {
        String word = "World and big brother is Java";
        int position = word.indexOf("Java");
        if(position != -1){
            System.out.println("Подстрока находится на позиции: " + position);
        }else {
            System.out.println("Подстрока не найдена");
        }
    }
}
