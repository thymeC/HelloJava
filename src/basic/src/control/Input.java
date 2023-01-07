package control;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("control.Input your name: ");
        String name = scanner.nextLine();
        System.out.println("control.Input your age: ");
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you're %d", name, age);
    }
}
