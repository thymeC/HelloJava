package basic;

public class StringConn {
    public static void main(String[] args) {
        // supported on JDK15
        String s = """
                   SELECT * FROM
                     users
                   WHERE id > 100
                   ORDER BY name DESC
                   """;
        System.out.println(s);

        String st = "hello";
        String t = st;
        st = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }

}
