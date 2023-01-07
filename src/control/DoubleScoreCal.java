package control;

public class DoubleScoreCal {
    public static void main(String[] args) {
        double x = 1-9.0/10;
        // 浮点数计算时可能会有精度问题
        // 浮点数判断相等，用和一个值的差值小于某个极小的数
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("Score as expected");
        }
    }
}
