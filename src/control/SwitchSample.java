package control;

public class SwitchSample {
    public static void main(String[] args) {
        String fruit = "apple";
        // case could only be int/String/Enum
        /* case 新语法 ->不需要写break, 多行用{}
        case -> System.out.println("Eat an apple");
        case -> {
        System.out.println("Eat an apple");
        System.out.println("Eat an apple");
        }
        还可以直接返回值
        case -> 1
        case "pear", "mongo" -> 2

        default -> {
        int code = fruit.hashCode();
        yield code; // switch 语句返回值

        java 14， switch语句升级为表达式，不再需要break
         */

        switch (fruit) {
            case "apple":
                System.out.println("Eat an apple");
                break;
            case "banana":
                System.out.println("Eat an banana");
                break;
            default:
                System.out.println("Enjoy yourself");
        }
    }
}
