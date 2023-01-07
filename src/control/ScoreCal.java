package control;

import java.util.Scanner;

public class ScoreCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your last score");
        double lastScore = scanner.nextDouble();
        System.out.println("Input your this score");
        double currentScore = scanner.nextDouble();
        double improvedPercent = (currentScore - lastScore) / lastScore * 100;
        System.out.printf("Your score got %.2f percent improved ", improvedPercent);
    }
}
