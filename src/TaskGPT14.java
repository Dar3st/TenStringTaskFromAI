import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskGPT14 {
    public static void main(String[] args) {
        User user = new User("Андрей", 19, "andryha@mail.ru");
        User user2 = new User("Олег", 25, "oleg@mail.ru");
        User user3 = new User("Андрей", 24,"opr@google.com");
        User user4 = new User("Игорь", 16, "igor@mail.ru");
        User user5 = new User("Андрей", 44,"stary@google.com");

        List<User> list = new ArrayList<>();

        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        System.out.println("-------до сортировки--------");
        for (User u : list) {
            System.out.println(u);
        }
        System.out.println("-------после сортировки-----");
        Collections.sort(list);
        for (User u : list) {
            System.out.println(u);
        }
    }
}

class User implements Comparable<User>{
    private String name;
    private Integer age;
    private String email;

    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int compareTo(User o){
        int result = this.name.compareTo(o.name);

        if (result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
