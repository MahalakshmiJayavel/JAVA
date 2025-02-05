import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); 

        System.out.println("Enter your name: ");
        String name = obj.nextLine();  

        System.out.println("Enter your age: ");
        int age = obj.nextInt();  

        obj.close();

        System.out.println("Hi " + name + " At " + age + ", be happy!");
    }
}
