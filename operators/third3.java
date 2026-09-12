package operators;

public class third3 {
    public static void main(String[] args) {
        int num = 7;
        int num1 = 7;

        int result = ++num;  //pre-increament   first it increment and then fetch 
        int result1 = num1++;  //post-increament    first it fetch then increament 

        System.out.println(result);
        System.out.println(result1);
        System.out.println(num1);
    }
}
