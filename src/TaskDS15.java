public class TaskDS15 {
    public static void main(String[] args) {
        String word = "Java";
        char[] ch = word.toCharArray();

        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(ch[i]);
            if(i == 0){
                System.out.print(" - преобразован путём обычного синтаксиса");
            }
        }
        System.out.println("");
        StringBuilder sb = new StringBuilder();

        String result = sb.append(word).reverse().toString();
        System.out.println(result + " - преобразован путём StringBuilder");
    }
}
