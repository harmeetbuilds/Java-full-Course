package typeConversionAndCasting;

public class second2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;

        int result = a*b;   //this is called type promotion because we are performing operation in byte and storing it in int and java promote it 

        System.out.println(result);
    }
}
