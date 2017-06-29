import java.util.Scanner;

public class HomeWork2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = sc.nextLine();
        System.out.println("В каком городе ты живешь?");
        String city = sc.nextLine();
        System.out.println("Какое твое хобби?");
        String hobby = sc.nextLine();
        System.out.println("Сколько тебе лет?");
        int age = sc.nextInt();

        // Вариант 1 - табличный
        System.out.println("\nИмя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

        // Вариант 2 - текстовый
        System.out.println("\nЧеловек по имени " + name + " живет в городе " + city + "\nЭтому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");

        // Вариант 3 - инной ( не совсем понял. нужно повторить или придумать свой?)
        System.out.println(name + " - имя");
        System.out.println(city + " - город");
        System.out.println(age + " - возрост");
        System.out.println(hobby + " - хобби");

    }
}
