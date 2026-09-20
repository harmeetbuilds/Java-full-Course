package classAndMethodsAndObject;

class Calculator{
    public int multiply(int a , int b){
        int result = a * b;
        return result;
    }
}
public class practice {
    public static void main(String[] args) {
        
    
    int num1 = 23;
    int num2 = 34;
    Calculator kallu = new Calculator();
    int r = kallu.multiply(num1,num2);
    System.out.println(r);
    
    }
    
}
