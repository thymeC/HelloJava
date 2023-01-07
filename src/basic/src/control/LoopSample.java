package control;

public class LoopSample {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("while loop");
        while (n > 0) {
            n = n - 1;
            System.out.println(n);
        }

        System.out.println("do...while loop");
        do {
            n = n + 1;
            System.out.println(n);
        } while (n < 10);
        // for循环会先初始化计数器，然后在每次循环前检测循环条件，在每次循环后更新计数器。
        System.out.println("for loop");
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("for loop 2");
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }

        System.out.println("for each");
        int[] nns = {1, 4, 9, 16, 25};
        for (int nn: nns) {
            System.out.println(nn);
        }
    }
}
