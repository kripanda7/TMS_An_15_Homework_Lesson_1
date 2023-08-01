import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Please, enter your name:");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
