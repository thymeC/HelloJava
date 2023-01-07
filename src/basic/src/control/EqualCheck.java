package control;

public class EqualCheck {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello".toLowerCase();
        // 引用类型判断相等用.equals()
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
