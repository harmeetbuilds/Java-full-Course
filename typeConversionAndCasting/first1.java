package typeConversionAndCasting;

public class first1 {
    
    public static void main(String[] args) {
        // byte b = 127;       
        // int a = b;              //this will work because b=byte(smaller) can store can store in a=int(bigger)

        int a = 12;
        byte k = (byte)a;        //this is called typecasting because we are converting a(int) to byte 
        
        System.out.println(k);


        float f = 8.2f;
        int b = (int)f;
        System.out.println(b);         //here we are also performing a type casting and converting a float to int 
    }
}
