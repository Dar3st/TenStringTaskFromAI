public class TaskGPT12 {
    public static void main(String[] args) {
        String word = "Hello, Iam is the best Java";
        if(word.startsWith("Hello") && word.endsWith("Java")){
            System.out.println("Поздравляем, вы поняли, как работают эти методы");
        }else{
            System.out.println("Упс, что-то пошло не так, попробуйте снова!");
        }
    }
}
