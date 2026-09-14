package LogicalOpera;

public class first1 {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int a = 9;
        int b = 10;

        boolean result = x < y && b > a;
        System.out.println(result);

        boolean result1 = x < y || b < a;
        System.out.println(result1);

        boolean Final = !(result && result1);

        System.out.println(Final);

        

    }
}
