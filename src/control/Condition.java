package control;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score:");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("啊哦，没及格");
        }
    }
}
