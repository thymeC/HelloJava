package basic;

public class BoolCalc {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age > 6 & age <12 ? true : false;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
